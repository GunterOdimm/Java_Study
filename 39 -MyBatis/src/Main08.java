import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main08 {
	public static void main(String[] args) {
	
	SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
	
	Professor model = new Professor();
	model.setProfno(9910);
	model.setSal(450);
	model.setPosirion("부교수");
	
	int result = sqlSession.update("ProfessorMapper.edit_professor",model);
	
	System.out.println(result + " 개의 데이터 수정됨");
	
	sqlSession.commit();
	sqlSession.close();
}


}
