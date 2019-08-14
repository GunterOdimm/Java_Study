package Study.java.program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class main02 {

	public static void main(String[] args) {
		// 파일이 저장될 경로
		String PATH = "./Test.txt";
		// 파일에 저장할 내용
		String write_string = "아이고 이건 테스트 파일입니다";
		byte[] buffer = null;
		OutputStream out = null;
		/*
		 * (3)이렇게 밖에다가 할당을 해줘야 문제가 안생긴다. (4)값을 null로 설정해야 후에 문제가 안생긴다.
		 */
		// 인코딩할 방식 설정
		try {
			/*
			 * (2) byte[] buffer = write_string.getBytes("utf-8"); 이렇게 하면 오류 가 난다
			 */
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// 인코딩에 오타가 존재하는지 확인
			e.printStackTrace();
		}

		// 파일 저장 절차 시작

		try {

			out = new FileOutputStream(PATH);
			/*
			 * (1)try & catch 때문에 버퍼 오류가난다( 서로 공간이 다름 ) 파일쓰기
			 */
			out.write(buffer);
			System.out.println("[INFO] 파일 저장에 성공했습니다 >> " + PATH);
		} catch (FileNotFoundException e) {
			// 파일 저장 경로가 존재하는지 않하는지 확인
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			// 파일 저장 공간이 충분한지 확인
			System.out.println("[ERROR] 파일 저장 실패했습니다. >> " + PATH);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알수 없는 에러 입니다. >> "+ PATH);
		}
		// 저장의 성공여부에 상관 없이 스트림은 무조건 닫아야 한다.(에러 생김)
		finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
