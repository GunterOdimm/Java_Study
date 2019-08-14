import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main6 {	public static void main(String[] args) {
	SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();

	Professor model = new Professor();
	model.setName("서진호");
	model.setUserid("sejinho90");
	model.setPosition("교수");
	model.setSal(450);
	model.setHiredate("2015-03-11");
	model.setDeptno(205);

	sqlSession.insert("ProfessorMapper.add_Professor", model);
	int result = model.getProfno();

	System.out.println(result + " 번 데이터 저장됨");

	sqlSession.commit();
	sqlSession.close();
}

}



