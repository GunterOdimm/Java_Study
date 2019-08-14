package Study.java.program;

import java.io.InputStream;

import Study.java.helper.HttpHelper;

public class Main02 {
	public static void main(String[] args) {

		String url = "https://www.naver.com";
		String encType = "UTF-8";

		// 읽은 값을 복사할 변수 선언 및 초기화
		String result = null;

		// 접속하기
		InputStream is = HttpHelper.getInstance().getWebData(url, encType);

		// 통신 실패시 예외 처리하기
		if (is == null) {
			System.out.println("통신 실패");
			return;
		}

		// 받은 응답에 대한 결과 처리
		try {
			byte[] buffer = new byte[is.available()];
			is.read(buffer);
			result = new String(buffer, encType);
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
