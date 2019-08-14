import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

public class Main02 {
	public static void main(String[] args) {
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		// 2) 삭제할 데이터 --> main01에서 출력된 값을 입력하세요.
		Department model = new Department();
		model.setDeptno(204);
		
		/* 
		 * 3) 데이터 삭제
		 * --> DepartmentMapper라는 namespace를 갖는 XML에서
		 * 	   remoce_department라는 id값을 갖는 <delete> 태그를 호출.
		 */
		int result = sqlSession.delete("DepartmentMapper.remove_department",model);
		
		System.out.println(result + " 개의 데이터 삭제됨");
		
		sqlSession.commit();
		sqlSession.close();
	}

}
