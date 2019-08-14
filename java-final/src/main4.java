import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

public class main4 {
	public static void main(String[] args) {
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		Department model = new Department();
		model.setDeptno(205);
		
		Department result = sqlSession.selectOne("DepartmentMapper.get_department_item",model);
		
		if(result == null) {
			System.out.println("조회결과 없음");
		} else {
			System.out.println(result.toString());
		}
		
		sqlSession.close();
	}

}
