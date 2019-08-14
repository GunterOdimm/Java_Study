import java.util.List;

import com.google.gson.Gson;

import study.java.helper.FileHelper;
import study.java.model.Json05;

public class GsonMain5 {
	public static void main(String[] args) {
		String json = FileHelper.getInstance().readString("res/05.json", "utf-8");

		Gson gson = new Gson();
		Json05 result = gson.fromJson(json, Json05.class);

		List<Json05.Rss.Item> list = result.getRss().getItem();

		for (int i = 0; i < list.size(); i++) {
			Json05.Rss.Item item = list.get(i);
			System.out.println(item);

		}

		System.out.println("---------------------");
		for (Json05.Rss.Item item : list) {
			System.out.println(item);
		}

	}

}
