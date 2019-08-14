import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;

public class Main11 {
	public static void main(String[] args) {
		
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		Student model = new Student();
		model.setName("서진호");
		model.setUserid("sejinho90");
		model.setGrade(3);
		model.setIdnum("9012241042117");
		model.setBirthdate("1990-12-24");
		model.setTel("031)966-6207");
		model.setHeight(177);
		model.setWeight(100);
		model.setProfno(9912);
		model.setDeptno(205);
		
		sqlSession.insert("StudentMapper.add_student", model);
		
		int result = model.getStudno();

		System.out.println(result + " 번 데이터 저장됨");

		sqlSession.commit();
		sqlSession.close();
	}

}
