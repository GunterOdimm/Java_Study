import com.google.gson.Gson;

import study.java.helper.FileHelper;
import study.java.model.Json03;

public class GsonMain3 {
	public static void main(String[] args) {
		String json = FileHelper.getInstance().readString("res/03.json", "utf-8");

		Gson gson = new Gson();
		Json03 result = gson.fromJson(json, Json03.class);
		System.out.println(result.toString());
	}

}
