import org.json.JSONObject;

import com.google.gson.Gson;

import study.java.helper.FileHelper;
import study.java.model.Json01;

public class GsonMain1 {
	public static void main(String[] args) {
		String json = FileHelper.getInstance().readString("res/01.json", "utf-8");
		
		Gson gson = new Gson();
		Json01 result = gson.fromJson(json, Json01.class);
		// 이게 구글에서 새로 제시하는 방식
		System.out.println(result.toString());
		
		/*
		 * 구형 방식.
		 * JSONObject json = new JSONObject(source);
		 * 
		 * String message = json.getString("message");
		 * 
		 * System.out.println(message);
		 * 
		 */
	}

}
