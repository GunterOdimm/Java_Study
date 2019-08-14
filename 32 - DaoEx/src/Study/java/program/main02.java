package Study.java.program;

import Study.java.dao.impl.JsonGradeDaolmpl;

import java.util.List;

import Study.java.dao.GradeDao;
import Study.java.model.Grade;

public class main02 {
	public static void main(String[] args) {
		GradeDao dao = new JsonGradeDaolmpl();
		List<Grade> list = dao.getGradeList();

		for (int i = 0; i < list.size(); i++) {
			Grade item = list.get(i);
			System.out.println(item.toString());
		}
	}

}
