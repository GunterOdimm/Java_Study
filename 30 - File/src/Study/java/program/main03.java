package Study.java.program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class main03 {
	public static void main(String[] args) {
		String PATH = "./Test.txt";
		
		// 읽은 파일 내용이 담겨질 스트림
		byte[] data = null;

		InputStream in = null;

		// 읽은 파일 내용이 변환될 문자열
		String read_string = null;

		// 파일 읽기
		try {
			in = new FileInputStream(PATH);

			// 읽은 내용을 감기 위한 배열은 파일의 용량만큼 사이즈를 할당한다.
			// in.avilavle() == 열고있는 파일의 크기

			data = new byte[in.available()];

			// 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다
			// 배열임으로 내용을 복사가 아니라 주소를 가르킨다.
			in.read(data);

			System.out.println("[INFO] 파일 읽기에 성공하였습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("[ERROE] 지정된 경로를 찾을 수 없습니다.");
			// 파일 경로에 문제가 있는지 확인
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다");
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		//data 배열에 내용이 있다면, 문자열로 변환하여 출력
		if(data != null) {
			//문자열로 변환시에는 저장된 인코딩으로 지정해 준다.
			try {
				read_string = new String(data, "utf-8");
				System.out.println(read_string);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] 인코딩 지정 에러 입니다.");
				e.printStackTrace();
			}
		}
	}
	

}
