package Study.java.program;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Study.java.dao.KakaoDao;
import Syudy.java.model.ImageItem;
import Study.java.dao.impl.ImageDaoImpl;
import Study.java.helper.FileHelper;
import Study.java.helper.HttpHelper;

public class Main01 {
	public static void main(String[] args) {
		KakaoDao dao = new ImageDaoImpl();

		Scanner scan = new Scanner(System.in);
		System.out.println("다운받고 싶은 이미지를 입력하세요");
		String UserWard = scan.next();
		
		List<ImageItem>list = dao.getImageSerchList(UserWard);
		if(list == null) {
			System.out.println("데이터 수신 실패");
			return;
		}
		//원본으로 받으면 브라우저가 아닐경우 받아주지 않는경우가 있다 이경우를 막아주는 코드
		//현제 페이지의 버전값을 의미한다.?
		Map<String, String> userAgent = new HashMap<String,String>();
		userAgent.put("use-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
		
		
		for (int i = 0; i < list.size(); i++) {
			ImageItem item = list.get(i);
			
			String img_url = item.getImage_url();
			//더더 좋은 이미지 다운 성공을 위한 코드
			String docUrl = item.getDoc_url();
			//이전에 너의 페이지에 있었다라고 속이는 코드
			userAgent.put("referrer", docUrl);
			
			InputStream bin = HttpHelper.getInstance().getWebData(img_url, "utf-8", null);
			//데이터 다운 실패시 다시 시작하는 코드
			if(bin == null) {
				continue;
			}
			
			long ms = Calendar.getInstance().getTimeInMillis();
			String fileName ="F:/사진/ㅋ/" + ms + ".gif";
			
			byte[] data = null;
			try {
				data = new byte[bin.available()];
				bin.read(data);
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			boolean is = FileHelper.getInstance().write(fileName, data);
			if(is) {
				System.out.println(fileName + "저장성공");
			}
			
			
		}
	}

}
