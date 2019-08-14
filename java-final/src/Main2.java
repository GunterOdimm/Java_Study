import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

public class Main2 {
	public static void main(String[] args) {

		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();

		Department model = new Department();
		model.setDeptno(205);
		model.setDname("현대미술학과");
		model.setLoc("9호관");

		int result = sqlSession.update("DepartmentMapper.edit_department", model);

		System.out.println(result + " 개의 데이터 수정됨");

		sqlSession.commit();
		sqlSession.close();
	}

}
