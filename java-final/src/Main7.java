import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main7 {
	public static void main(String[] args) {

		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();

		Professor model = new Professor();
		model.setSal(550);
		model.setPosition("학장");
		model.setProfno(9911);

		int result = sqlSession.update("ProfessorMapper.edit_professor", model);

		System.out.println(result + " 개의 데이터 수정됨");

		sqlSession.commit();
		sqlSession.close();
	}

}
