package Study.java.dao.impl;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import Study.java.dao.KakaoDao;
import Study.java.helper.HttpHelper;
import Study.java.helper.JsonHelper;
import Syudy.java.model.BlogItem;
import Syudy.java.model.BookItem;
import Syudy.java.model.ImageItem;
import Syudy.java.model.WebItem;

public class ImageDaoImpl implements KakaoDao{

	@Override
	public List<ImageItem> getImageSerchList(String keyword) {
		List<ImageItem>list = null;
		
		String search = null;
		
		try {
			// 검색어로 사용할 것을 인코딩해서 처리 (주소창에는 한글 사용 불가)
			search = URLEncoder.encode(keyword,"utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 방식의 에러 입니다 개발자는 확인하세요");
			e.printStackTrace();
		}
		
		//카카오 openAPI주소
		String url = "https://dapi.kakao.com/v2/search/image?query=" + search;
		
		//발급받은 REST API 키를 "KakaoAK REST_API_키" 형식으로 정의
		Map<String, String> header = new HashMap<String,String>();
		header.put("Authorization", "KakaoAK 1f84f241e9d1a0f871dc40e7926ac5f1");
		
		InputStream is = HttpHelper.getInstance().getWebData(url, "utf-8", header);
		
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		list = new ArrayList<ImageItem>();
		
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		
		JSONArray documents = json.getJSONArray("documents");
		
		for (int i = 0; i < documents.length(); i++) {
			JSONObject item = documents.getJSONObject(i);
			
			String collection = item.getString("collection");
			String thumbnail_url = item.getString("thumbnail_url");
			String image_url = item.getString("image_url");
			int width = item.getInt("width");
			int height = item.getInt("height");
			String displaysitename = item.getString("display_sitename");
			String doc_url = item.getString("doc_url");
			String dateTime = item.getString("datetime");
			
			list.add(new ImageItem(collection, dateTime, displaysitename, doc_url, height, image_url, thumbnail_url, width));
			
			
		}
		
		return list;
	}

	@Override
	public List<WebItem> getWebSearchList(String keyword) {
		
		List<WebItem>list = null;
		
		String search = null;
		
		try {
			// 검색어로 사용할 것을 인코딩해서 처리 (주소창에는 한글 사용 불가)
			search = URLEncoder.encode(keyword,"utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 방식의 에러 입니다 개발자는 확인하세요");
			e.printStackTrace();
		}
		
		//카카오 openAPI주소
		String url1 = "https://dapi.kakao.com/v2/search/web?query=" + search;
		
		//발급받은 REST API 키를 "KakaoAK REST_API_키" 형식으로 정의
		Map<String, String> header = new HashMap<String,String>();
		header.put("Authorization", "KakaoAK 1f84f241e9d1a0f871dc40e7926ac5f1");
		
		InputStream is = HttpHelper.getInstance().getWebData(url1, "utf-8", header);
		
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		list = new ArrayList<WebItem>();
		
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		
		JSONArray documents = json.getJSONArray("documents");
		
		for (int i = 0; i < documents.length(); i++) {
			JSONObject item = documents.getJSONObject(i);
			
			String title = item.getString("title");
			String datetime = item.getString("datetime");
			String url = item.getString("url");
			String contents = item.getString("contents");
			//=
			
			list.add(new WebItem(title, datetime, url1, contents));
			
			
		}
		
		return list;
	}

	@Override
	public List<BlogItem> getBlogSearchList(String keyword) {
		
		List<BlogItem>list = null;
		
		String search = null;
		
		try {
			// 검색어로 사용할 것을 인코딩해서 처리 (주소창에는 한글 사용 불가)
			search = URLEncoder.encode(keyword,"utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 방식의 에러 입니다 개발자는 확인하세요");
			e.printStackTrace();
		}
		
		//카카오 openAPI주소
		String url1 = "https://dapi.kakao.com/v2/search/web?query=" + search;
		
		//발급받은 REST API 키를 "KakaoAK REST_API_키" 형식으로 정의
		Map<String, String> header = new HashMap<String,String>();
		header.put("Authorization", "KakaoAK 1f84f241e9d1a0f871dc40e7926ac5f1");
		
		InputStream is = HttpHelper.getInstance().getWebData(url1, "utf-8", header);
		
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		list = new ArrayList<BlogItem>();
		
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		
		JSONArray documents = json.getJSONArray("documents");
		
		for (int i = 0; i < documents.length(); i++) {
			JSONObject item = documents.getJSONObject(i);
			
			String blogname = item.getString("blogname");
			String contents = item.getString("contents");
			String datatime = item.getString("datatime");
			String thumbnail = item.getString("thumbnail");
			String url = item.getString("url");
			String title = item.getString("title");
			//=
			
			list.add(new BlogItem(blogname, contents, datatime, thumbnail, title, url1) );
			
			
		}
		return list;
	}

	@Override
	public List<BookItem> getBookSearchList(String keyword) {
		
		List<BookItem>list = null;
		
		String search = null;
		
		try {
			// 검색어로 사용할 것을 인코딩해서 처리 (주소창에는 한글 사용 불가)
			search = URLEncoder.encode(keyword,"utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 방식의 에러 입니다 개발자는 확인하세요");
			e.printStackTrace();
		}
		
		//카카오 openAPI주소
		String url1 = "https://dapi.kakao.com/v2/search/web?query=" + search;
		
		//발급받은 REST API 키를 "KakaoAK REST_API_키" 형식으로 정의
		Map<String, String> header = new HashMap<String,String>();
		header.put("Authorization", "KakaoAK 1f84f241e9d1a0f871dc40e7926ac5f1");
		
		InputStream is = HttpHelper.getInstance().getWebData(url1, "utf-8", header);
		
		if(is == null) {
			System.out.println("데이터 다운로드 실패");
			return null;
		}
		
		list = new ArrayList<BookItem>();
		
		JSONObject json = JsonHelper.getInstance().getJSONObject(is, "utf-8");
		
		JSONArray documents = json.getJSONArray("documents");
		
		for (int i = 0; i < documents.length(); i++) {
			JSONObject item = documents.getJSONObject(i);
			
			JSONArray tmp = item.getJSONArray("authors");
			String[] authors = new String[tmp.length()];
			
			for (int j=0; j<tmp.length(); j++) {
				authors[j] = String.valueOf(tmp.get(j));
			}
					
			String contents = item.getString("contents");
			String datetime = item.getString("datetime");
			String isbn = item.getString("isbn");
			int price = item.getInt("price");
			String publisher = item.getString("publisher");
			int saleprice = item.getInt("sale_price");
			String thumbnail = item.getString("thumbnail");
			String title = item.getString("title");
			String translators = item.getString("translators");
			String url = item.getString("url");
			
			list.add(new BookItem(authors, contents, datetime, isbn, price, publisher, saleprice, thumbnail, title, translators, url1));
			
		}
		return list;
	}

}
