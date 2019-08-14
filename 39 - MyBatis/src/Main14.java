

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;

public class Main14 {
	public static void main(String[] args) {
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		Student model = new Student();
		model.setStudno(20107);
		
		Student result = sqlSession.selectOne("StudentMapper.get_student_item",model);
		
		if(result == null) {
			System.out.println("조회결과 없음");
		} else {
			System.out.println(result.toString());
		}
		
		sqlSession.close();
	}


}
