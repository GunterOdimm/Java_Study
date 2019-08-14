package Study.java.program;

import org.json.JSONArray;
import org.json.JSONObject;

import Study.java.helper.FileHelper;

public class Main03 {
	public static void main(String[] args) {
		String source = FileHelper.getInstance().readString("res/03.json", "utf-8");

		JSONObject json = new JSONObject(source);
		// 배열 구조는 JSONArray 객체로 추출한다.
		JSONArray array = json.getJSONArray("item");

		for (int i = 0; i < array.length(); i++) {
			String item = String.valueOf(array.get(i));
			System.out.println(item);
		}

	}

}
