package Study.java.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
	private static FileHelper FC1;

	public static FileHelper getInstance() {
		if (FC1 == null) {
			FC1 = new FileHelper();
		}
		return FC1;
	}

	private FileHelper() {
	}

	public boolean write(String filePath, byte[] data) {
		boolean result = false;

		OutputStream out = null;
		
		try {
			out = new FileOutputStream(filePath);
			out.write(data);
			System.out.println("[INFO] 저장에 성공하였습니다. >> " + filePath);
			
		} catch (FileNotFoundException e) {
			// 파일 저장 경로가 존재하는지 않하는지 확인
			e.printStackTrace();
		} catch (IOException e) {
			// 파일 저장 공간이 충분한지 확인
			e.printStackTrace();
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

		return result;
	}

	public byte[] read(String filePath) {
		byte[] data = null;
		InputStream in = null;
		try {
			in = new FileInputStream(filePath);

			// 읽은 내용을 감기 위한 배열은 파일의 용량만큼 사이즈를 할당한다.
			// in.avilavle() == 열고있는 파일의 크기

			data = new byte[in.available()];

			// 파일 읽기 - 파라미터로 전달된 배열 안에, 파일의 내용을 담아준다
			// 배열임으로 내용을 복사가 아니라 주소를 가르킨다.
			in.read(data);

			System.out.println("[INFO] 파일 읽기에 성공하였습니다. >> " + filePath);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROE] 지정된 경로를 찾을 수 없습니다. >> " + filePath);
			// 파일 경로에 문제가 있는지 확인
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 읽기 실패했습니다. >> " + filePath);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다 >> " + filePath);
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

		return data;

	}

	public boolean writeString(String filePath, String content, String encType) {
		boolean result = false;
		byte[] data = null;

		try {
			data = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 인코딩 지정 에러");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다");
			e.printStackTrace();
		}
		result = this.write(filePath, data);
		return result;
	}

	public String readString(String filePath, String encType) {
		String content = null;
		byte[] data = this.read(filePath);
		// 앞서 준비한 read() 메서드의 호출

		// 내용을 문자열로 반환한다.
		try {
			content = new String(data, encType);
			content = content.trim();
			// 가끔씩 앞뒤에 공백이 생기는 경우가 존재한다
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 인코딩 지정 에러");
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다");
			e.printStackTrace();
		}
		return content;
	}

}