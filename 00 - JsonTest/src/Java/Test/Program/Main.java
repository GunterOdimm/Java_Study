package Java.Test.Program;

import org.json.JSONArray;
import org.json.JSONObject;

import Java.Test.Helper.testHelper;
import Java.Test.Model.JsonBeans;

public class Main {
	public static void main(String[] args) {
		int allsum = 0;
		int persum = 0;
		int perAberage = 0;
		int allAberage = 0;
		String scoure = testHelper.getInstance().readString("res/studentTestGrade.json", "utf-8");

		JSONObject json = new JSONObject(scoure);
		// 이부분은 studentTestGread에서 성적을 저장합니다.
		JSONArray perSco = json.getJSONArray("성적");
		// 이부분은 학생의 이름과 각각의 성적을 배열로 저장합니다.

		for (int i = 0; i < perSco.length(); i++) {
			// 배열상태의 값을 하나하나 꺼내기 위한 작업
			JSONObject temp = perSco.getJSONObject(i);
			// 배열값 하나씩 뽑아서 저장.

			String name = temp.getString("이름");
			int kor = temp.getInt("국어");
			int eng = temp.getInt("영어");
			int math = temp.getInt("수학");
			persum = kor + eng + math;
			perAberage = persum / 3;
			allsum += persum;
			JsonBeans news = new JsonBeans(name, kor, eng, math);
			System.out.println(name + "학생 개인 평균점수는 " + perAberage + "점 입니다.");
		}

		allAberage = allsum / 9;
		System.out.println("합급 전체 평균점수는 " + allAberage + "점 입니다");
	}

}
