package SelfTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class TestHelper{
	private static TestHelper c1;
	
	public static TestHelper getInstance() {
		if(c1 == null) {
			c1 = new TestHelper();
		}
		return c1;
		
	}
	
	private TestHelper(){
	}
	
	public boolean write(String filePath, byte[] data) {
		
		boolean result = false;
		OutputStream out = null;
		
		try {
			out = new FileOutputStream(filePath);
			try {
				out.write(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				in.read(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
		
	}
	
	public boolean writeString(String filePath,String content, String encType) {
		boolean result = false;
		byte[] data = null;
		
		try {
			data = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result = this.write(filePath, data);
		return result;
	}
	
	public  String readString(String filePath,String encType) {
		String content = null;
		byte[] data = this.read(filePath);
		
		try {
			content = new String(data, encType);
			content = content.trim();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return content;
	}
	
	
}