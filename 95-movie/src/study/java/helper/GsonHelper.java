package study.java.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import com.google.gson.Gson;

public class GsonHelper {
	
	private static GsonHelper current;

	public static GsonHelper getInstance() {
		if (current == null) {
			current = new GsonHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private GsonHelper() {
		super();
	}
	
	/**
	 * InputStream 객체를 Gson을 사용하여 Beans 객체로 변환하여 리턴한다.
	 * @param is - InputStream 객체
	 * @param encType - InputStream이 읽어들인 Xml의 인코딩 형식
	 * @param clazz - 클래스타입의 클래즈는 모든 클래스를 대신할 수 있다.
	 * @return Object
	 */
	public Object getJSONObject(InputStream is, String encType, Class<?> clazz) {
		
		Object object = null;
		
		// InputStream의 내용을 저장할 문자열
		String source = null;
		
		BufferedReader reader = null;
		
		try {
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			reader = new BufferedReader(new InputStreamReader(is, encType));
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			source = sb.toString();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		Gson gson = new Gson();
		object = gson.fromJson(source, clazz);
		return object;
	}
	
	public Object getJSONObject(String url, String encType, Map<String, String> header, Class<?> clazz) throws Exception {
		
		InputStream is = HttpHelper.getInstance().getWebData(url, encType, header);
		
		if(is == null) {
			throw new Exception("통신처리에 실패했습니다.");
		}
		return this.getJSONObject(is, encType, clazz);
	}
	
	public Object getJSONObject(String url, Map<String, String> header, Class<?> clazz) throws Exception {
		return this.getJSONObject(url, "UTF-8", header, clazz);
	}
	
	public Object getJSONObject(String url, Class<?> clazz) throws Exception {
		return this.getJSONObject(url, "UTF-8", null,  clazz);
	}

}
