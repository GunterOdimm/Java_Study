package Study.java.dao.impl;

import java.util.ArrayList;
import java.util.List;

import Study.java.dao.GradeDao;
import Study.java.helper.FileHelper;
import Study.java.model.Grade;

public class FileGradeDaoImpl implements GradeDao {

	/*
	 * 어떤 객체가 생성 되었는지 확인하기 위하여 클래스 이름을 출력한다.
	 */

	public FileGradeDaoImpl() {
		String clsName = this.getClass().getCanonicalName();
		System.out.println("-----" + clsName + "-----");
	}

	@Override
	public List<Grade> getGradeList() {
		// 리턴할 객체를 선언함
		List<Grade> list = null;

		String source = FileHelper.getInstance().readString("res/grade.csv", "euc-kr");

		if (source == null) {
			return null;
		}
		list = new ArrayList<Grade>();

		String[] data = source.split("\n");

		for (int i = 0; i < data.length; i++) {

			String line_String = data[i].trim();

			String[] line_data = line_String.split(",");

			String name = line_data[0];
			int kor = Integer.parseInt(line_data[1]);
			int eng = Integer.parseInt(line_data[2]);
			int math = Integer.parseInt(line_data[3]);

			Grade item = new Grade(name, kor, eng, math);
			list.add(item);

		}

		return list;
	}

}
