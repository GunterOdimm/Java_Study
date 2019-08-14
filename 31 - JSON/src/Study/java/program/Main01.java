package Study.java.program;

import org.json.JSONObject;

import Study.java.helper.FileHelper;

public class Main01 {
	public static void main(String[] args) {
		
		String source = FileHelper.getInstance().readString("res/01.json","utf-8");
		
		JSONObject json = new JSONObject(source);
		
		String message = json.getString("message");
		
		System.out.println(message);

	}

}
