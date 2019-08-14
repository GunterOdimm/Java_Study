import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;

public class Main13 {
	public static void main(String[] args) {
	
	SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
	
	Student model = new Student();
	model.setStudno(20107);
	model.setGrade(4);
	model.setTel("031)966-6208");
	
	int result = sqlSession.update("StudentMapper.edit_student",model);
	
	System.out.println(result + " 개의 데이터 수정됨");
	
	sqlSession.commit();
	sqlSession.close();
}


}
