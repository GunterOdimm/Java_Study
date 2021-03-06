import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Professor;

public class Main06 {
	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();

		/*
		 * 2) INSERT를 수행할 데이터 생성 --> Beans에 생성자를 정의하지 않으면 필요한 데이터만 setter로 추가할 수 있다.
		 * INSERT INTO department (name, userid, position, sal, hiredate, comm, deptno)
		 */
		Professor model = new Professor();
		model.setName("서진원");
		model.setUserid("sejew93");
		model.setPosirion("조교수");
		model.setSal(300);
		model.setHiredate("2019-03-11");
		model.setDeptno(101);

		/*
		 * 3) 데이터 저장 DepartmentMapper 라는 namespace 를 갖는 XML에서 id값이 add_department인
		 * <insert>태그를 호출한다.
		 */
		sqlSession.insert("ProfessorMapper.add_Professor", model);
		// 이 때, 저장할 데이터를 담고 있는 Beans를 파라미터로 전달하고,
		// 자동으로 생성된 PK는 Beans에 저장된다.
		int result = model.getProfno();

		/*
		 * 4) 결과 판별 --> 리턴값이 0이라면 내부적으로 예외가 발생된 상황으로 간주해야 한다.
		 */
		System.out.println(result + " 번 데이터 저장됨");

		sqlSession.commit();
		sqlSession.close();
	}

}
