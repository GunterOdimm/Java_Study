import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main9 {
	public static void main(String[] args) {
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		Professor model = new Professor();
		model.setProfno(9910);
		
		Professor result = sqlSession.selectOne("ProfessorMapper.get_professor_item",model);
		
		if(result == null) {
			System.out.println("조회결과 없음");
		} else {
			System.out.println(result.toString());
		}
		
		sqlSession.close();
	}


}
