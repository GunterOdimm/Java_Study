import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentSercive;
import study.java.myschool.service.impl.DepartmentServicelmpl;

public class Main16 {
	public static void main(String[] args) {
		
		// 처리 결과를 기록할 Log4J 객체 생성
		// 파라미터는 현재 클래스의 이름(String)
		Logger logger = LogManager.getFormatterLogger(Main16.class.getName());
		
		// 저장될 데이터를 담고 있는 Beans 객체 생성
		Department dept = new Department();
		dept.setDname("정보통신학과");
		dept.setLoc("통신관");
		
		// 데이터 베이스 접속
		SqlSession session = MyBatisConnectionFactory.getSqlsession();
		
		// 데이터 처리 수행
		//비지니스 로직을 위한 Service 객체 생성
		DepartmentSercive departmentService = new DepartmentServicelmpl(session);
		//저장된 결과를 리턴받기 위한 Beans 객체
		Department result = null;
		
		try {
			// 학과 저장하기
			result = departmentService.addDepartment(dept);
			// 저장 결과를 데이터베이스에 반영하기
			session.commit();
			// 처리 결과를 로그에 기록하기
			logger.debug("저장된 데이터 >> " + result.toString());
		} catch (NullPointerException e) {
			
			logger.error("저장된 데이터가 없습니다");
			e.printStackTrace();
		} catch (Exception e) {
			
			logger.error("SQL 문에 문제가 있어 데이터 저장에 실패핬습니다. >> " + e.getMessage());
			e.printStackTrace();
		}
		
		session.close();
	}

}
