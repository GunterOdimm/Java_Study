package Study.java.program;

import Study.java.helper.FileSingeTon;

public class main04 {
	public static void main(String[] args) {
		String encType = "UTF-8";
		String filePath = "myfile.txt";
		String content = "싱글톤을 이용한 텍스트 파일입니다.";
		
		boolean result = FileSingeTon.getInstance().writeString(filePath, content, encType);
		
		if(!result) {
			System.out.println("파일 저장에 실패햇습니다");
			
		}
		String read = FileSingeTon.getInstance().readString(filePath, encType);
		System.out.println(read);
	}

}
