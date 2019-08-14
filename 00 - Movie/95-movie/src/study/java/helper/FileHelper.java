package study.java.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
	
	private static FileHelper current;

	public static FileHelper getInstance() {
		if (current == null) {
			current = new FileHelper();
		}
		return current;
	}

	public static void freeInstance() {
		current = null;
	}

	private FileHelper() {
	}
	
	/**
	 * 주어진 경로에 data값을 기록하고 저장한다.
	 * @param filePath - 저장할 파일 경로
	 * @param data - 저장할 내용을 담은 스트림
	 * @return boolean - 성공시 true, 실패시 false;
	 */
	public boolean write(String filePath, byte[] data) {
		boolean result = false;
		// Main02.java의 파일저장 절차 (try ~ catch ~ finally)를 복사헤 온다
		
		/** 파일 저장 절차 시작 */
		OutputStream out = null;
		try {
		out = new FileOutputStream(filePath);
		//파일 쓰기
		out.write(data);
		System.out.println("파일 저장됨 " + filePath);
		// 저장에 성공하였으므로, 결과값을 true로 변경
		result =true;
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("저장경로를 찾을 수 없음" + filePath);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 저장 실패" + filePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러" + filePath);
		}
		return result;
	}
	
	/**
	 * 주어진 경로의 파일을 읽고, 내용을 스트림으로 리턴한다
	 * @param filePath - 읽어야 할 파일의 경로
	 * @return - 읽혀진 내용
	 */
	public byte[] read(String filePath) {
		byte[] data = null;

		InputStream in = null;
		
		try {
			in = new FileInputStream(filePath);
			
			//읽은 내용을 담기 위한 배열은 파일의 크기만큼 사이즈 할당
			//in.available() -> 열고 있는 파일 크기
			data = new byte[in.available()];
			in.read(data);
			System.out.println("파일 읽기 성공" + filePath);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("저장 경로를 찾을 수 없습니다" + filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 읽기 실패" + filePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러" + filePath);
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return data;
	}
	
	/**
	 * 파일을 저장한다
	 * @param filePath - 저장할 파일 경로
	 * @param content - 저장할 내용
	 * @param encType - 인코딩 형식
	 * @return boolean - 성공시 true, 실패시 false;
	 */
	public boolean writeString(String filePath, String content, String encType) {
		boolean result = false;
		byte[] data = null;
		
		try {
			data = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("인코딩 지정 에러");
		} catch ( Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러" + filePath);
		}
		
		//앞서 준비한 write() 메서드의 호출
		result = this.write(filePath, data);
		return result;
		
	}
	
	/**
	 * 파일의 내용을 문자열로 리턴한다
	 * @param filePath - 읽어야 할 파일의 경로
	 * @param encType - 인코딩 형식
	 * @return String - 읽은 내용에 대한 문자열
	 */
	public String readString(String filePath, String encType) {
		String content = null;
		
		byte[] data = this.read(filePath);	// 앞서 준비한 read() 메서드의 호출
		
		//내용을 문자열로 변환
		try {
			content = new String(data, encType);
			content = content.trim();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println("인코딩 지정 에러");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("알 수 없는 에러" + filePath);
		}
		return content;
	}

		

	

}
