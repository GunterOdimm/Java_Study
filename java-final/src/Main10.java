import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main10 {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		List<Professor> result = sqlSession.selectList("ProfessorMapper.get_professor_list");
		
		if(result == null) {
			
			System.out.println("조회결과 없음");
		} else {
			for(int i = 0; i<result.size(); i++) {
				Professor item = result.get(i);
				System.out.println(item.toString());
			}
		}
		
		sqlSession.close();
	}



}
