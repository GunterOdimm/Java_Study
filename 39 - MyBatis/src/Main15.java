import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;

public class Main15 {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		List<Student> result = sqlSession.selectList("StudentMapper.get_student_list");
		
		if(result == null) {
			System.out.println("조회결과 없음");
		} else {
			for(int i = 0; i<result.size(); i++) {
				Student item = result.get(i);
				System.out.println(item.toString());
			}
		}
		
		sqlSession.close();
	}



}
