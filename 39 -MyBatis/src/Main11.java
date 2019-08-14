import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Student;

public class Main11 {
	public static void main(String[] args) {
		// 1) 데이터베이스 접속
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();

		/*
		 * 2) INSERT를 수행할 데이터 생성 --> Beans에 생성자를 정의하지 않으면 필요한 데이터만 setter로 추가할 수 있다.
		 * INSERT INTO student (name, userid, grade, idnum, birthdate, tel, height, weight, profno, deptno)
		 */
		Student model = new Student();
		model.setName("서진원");
		model.setUserid("sejew93");
		model.setGrade(3);
		model.setIdnum("9310071042110");
		model.setBirthdate("1993-10-07");
		model.setTel("031)966-6207");
		model.setHeight(177);
		model.setWeight(85);
		model.setProfno(9910);
		model.setDeptno(203);

		/*
		 * 3) 데이터 저장 DepartmentMapper 라는 namespace 를 갖는 XML에서 id값이 add_department인
		 * <insert>태그를 호출한다.
		 */
		sqlSession.insert("StudentMapper.add_student", model);
		// 이 때, 저장할 데이터를 담고 있는 Beans를 파라미터로 전달하고,
		// 자동으로 생성된 PK는 Beans에 저장된다.
		int result = model.getStudno();

		/*
		 * 4) 결과 판별 --> 리턴값이 0이라면 내부적으로 예외가 발생된 상황으로 
		 * 간주해야 한다.
		 */
		System.out.println(result + " 번 데이터 저장됨");

		sqlSession.commit();
		sqlSession.close();
	}


}
