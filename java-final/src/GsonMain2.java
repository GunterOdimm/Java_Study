import com.google.gson.Gson;

import study.java.helper.FileHelper;
import study.java.model.Json02;

public class GsonMain2 {
	public static void main(String[] args) {
		String json = FileHelper.getInstance().readString("res/02.json", "utf-8");

		Gson gson = new Gson();
		Json02 result = gson.fromJson(json, Json02.class);
		System.out.println(result.toString());
	}

}
