package Java.Test.Helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class testHelper {
	//싱글톤 생성
	private static testHelper tc1;
	public static testHelper getInstance() {
		if(tc1 == null) {
			tc1 = new testHelper();
		}
		return tc1;
		
	}
	private testHelper() {
		
	}
	
	
	
	//JSON파일을 받아서 저장
	public boolean werite(String filePath, byte[] data) {
		boolean result = false;
		OutputStream out = null;
		
		try {
			out = new FileOutputStream(filePath);
			try {
				out.write(data);
				System.out.println("저장에 성공하였습니다. >> " + filePath);
			} catch (FileNotFoundException e) {
				// 파일 저장 경로가 존재하는지 않하는지 확인
				e.printStackTrace();
				} catch (IOException e) {
				System.out.println("파일공간이 충분하지 못합니다. >> " + filePath);
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 을 찾지 못했습니다. >> " + filePath);
			e.printStackTrace();
		}finally {
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
			try {
				data = new byte[in.available()];
			} catch (IOException e) {
				System.out.println("파일의 저장공간이 충분하지 못합니다. >>" + filePath);
				e.printStackTrace();
			}
			try {
				in.read(data);
			} catch (IOException e) {
				System.out.println("파일의 저장공간이 충분하지 못합니다. >>" + filePath);
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못하였습니다. >> " + filePath);
			e.printStackTrace();
		}finally {
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
			System.out.println("인코딩 설정이 잘못되었습니다. >> " + encType);
			e.printStackTrace();
		}
		
		result = this.werite(filePath, data);
		//결과값을 지정
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
			System.out.println("인코딩 설정이 잘못되었습니다. >> " + encType);
			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("알 수 없는 에러가 발생했습니다.");
			e.printStackTrace();
		}
		return content;
	}

}
