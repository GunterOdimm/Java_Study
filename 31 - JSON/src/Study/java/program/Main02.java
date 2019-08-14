package Study.java.program;

import org.json.JSONObject;

import Study.java.helper.FileHelper;

public class Main02 {
	public static void main(String[] args) {
		String source = FileHelper.getInstance().readString("res/02.json","utf-8");
		JSONObject json = new JSONObject(source);
		
		String title = json.getString("title");
		String description = json.getString("description");
		String pubDate = json.getString("pubDate");
		
		System.out.println("title = " + title);
		System.out.println("description = " + description);
		System.out.println("pubDate = " + pubDate);
		
	}

}
