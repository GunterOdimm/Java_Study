package Study.java.helper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

import javax.net.ssl.SSLContext;
//import javax.net.ssl.SSLSocketFactory;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class HttpHelper {
	private static HttpHelper currnet = null;

	public static HttpHelper getInstance() {
		if (currnet == null) {
			currnet = new HttpHelper();
		}
		return currnet;
	}

	private HttpHelper() {
	}

	public InputStream getWebData(String url, String encType, Map<String, String>header) {

		int timeout = 30000;
		// 통신객체
		HttpClient client = null;
		// 접속을 하기 위한 기본 환경설정 객체
		HttpParams params = new BasicHttpParams();
		// 프로토콜 버전 설정.
		params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
		// 요청 제한 시간
		HttpConnectionParams.setConnectionTimeout(params, timeout);
		// 응답 제한 시간
		HttpConnectionParams.setSoTimeout(params, timeout);
		// 통신에 사용할 인코딩 값 설정
		HttpProtocolParams.setContentCharset(params, encType);
		// 접속 기능
		client = new DefaultHttpClient(params);
		
		try {
			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, null, null);
			
			SSLSocketFactory sf = new SSLSocketFactory(sslContext, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
			Scheme sch = new Scheme("https", 443, sf);
			
			client.getConnectionManager().getSchemeRegistry().register(sch);
		} catch (Exception e) {
			System.out.println("SSL 인증 실패");
			e.printStackTrace();
		}
		
		
		InputStream is = null;

		// 통신에 필요한 요청 정보 설정 --> URL을 주소 표시줄에 입력하기
		HttpGet httpget = new HttpGet(url);
		//이부분 이해안됨
		//HTTP Header가 전달된 경우 요청정보에 Header 데이터를 추가한다.
		if(header != null) {
			for(String key : header.keySet()) {
				httpget.addHeader(key,header.get(key));
				/*
				 * header.keSet() = Authorization 이 된다
				 * header.get(key) 가 값을 받게 된다
				 * 반복문 돌려서 헤드 값이 몇개이던 반복문으로 돌린다
				 */
			}
		}

		// 요청을 보낸 후, 응답 받기
		try {
			HttpResponse response = client.execute(httpget);

			// 웹 서버의 응답 결고 ㅏ코드 받기
			// 404 : Page Not Found (주소 오타, 파일 없음)
			// 500 : Sever Error, 200 : OK
			int resultCode = response.getStatusLine().getStatusCode();

			// 서버 응답이 정상일 경우에만 처리
			if (resultCode == HttpURLConnection.HTTP_OK) {
				// 수진된 응답에서 실 데이터 추출
				HttpEntity entity = response.getEntity();
				BufferedHttpEntity buffer = new BufferedHttpEntity(entity);

				is = buffer.getContent();

			}
		} catch (ClientProtocolException e) {
			System.out.println("[ERROR] 페이지 주소 오류입니다.");
			
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패했습니다.");
			
			e.printStackTrace();
		} finally {
			// 통신 해제
			client.getConnectionManager().shutdown();
		}

		return is;
	}

}
