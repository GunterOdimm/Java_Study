import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

public class Main1 {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		Department model = new Department();
		model.setDname("Java학과");
		model.setLoc("공학관");
		
		sqlSession.insert("DepartmentMapper.add_department",model);
		int result = model.getDeptno();
		
		System.out.println(result + " 번 데이터 저장됨");
		
		sqlSession.commit();
		sqlSession.close();
	}

}