import org.json.JSONObject;

import com.google.gson.Gson;

import study.java.helper.FileHelper;
import study.java.model.Json04;

public class GsonMain4 {
	public static void main(String[] args) {
		String json = FileHelper.getInstance().readString("res/04.json", "utf-8");

		Gson gson = new Gson();
		Json04 result = gson.fromJson(json, Json04.class);
		System.out.println(result.toString());
		
		
		/*
		 * 구형방식의 Json만들기
		 * JSONObject json = new JSONObject(source); 
		 * JSONObject rss = json.getJSONObject("rss"); 
		 * JSONObject item = rss.getJSONObject("item");
		 * 
		 * String title = item.getString("title"); 
		 * String description = item.getString("description"); 
		 * String pubDate = item.getString("pubDate");
		 * 
		 * News news = new News(title, description, pubDate);
		 * System.out.println(news.toString());
		 */
	}

}
