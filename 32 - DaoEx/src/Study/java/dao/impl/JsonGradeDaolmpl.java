package Study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import Study.java.dao.GradeDao;
import Study.java.helper.FileHelper;
import Study.java.model.Grade;

public class JsonGradeDaolmpl implements GradeDao {

	public JsonGradeDaolmpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("-----" + clsName + "-----");
	}

	@Override
	public List<Grade> getGradeList() {

		List<Grade> list = null;

		String source = FileHelper.getInstance().readString("res/grade.json", "utf-8");

		if (source == null) {
			return null;
		}

		list = new ArrayList<Grade>();

		JSONObject json = new JSONObject(source);

		JSONArray grade = json.getJSONArray("grade");

		for (int i = 0; i < grade.length(); i++) {

			JSONObject temp = grade.getJSONObject(i);

			String name = temp.getString("name");
			int kor = temp.getInt("kor");
			int eng = temp.getInt("eng");
			int math = temp.getInt("math");

			Grade item = new Grade(name, kor, eng, math);
			list.add(item);
		}

		return list;
	}

}
