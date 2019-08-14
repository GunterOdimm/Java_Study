import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentSercive;
import study.java.myschool.service.impl.DepartmentServicelmpl;

public class Main17 {
	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(Main17.class.getName());
		
		Department dept = new Department();
		dept.setDeptno(201);
		dept.setDname("미래전자공학과");
		dept.setLoc("12호관");
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();
		
		//데이터 처리 수행
		
		DepartmentSercive departmentService = new DepartmentServicelmpl(session);
		
		Department result = null;
		
		try {
			//학과 수정하기
			
			result = departmentService.editDepartment(dept);
			//수정결과를 데이터베이스에 반영하기
			session.commit();
			// 처리 결과를 로그에 기록하기
			logger.debug("수정된 데이터 >> " + result.toString());
		} catch (NullPointerException e) {
			//수정된 데이터가 없는 경우
			logger.error("수정된 데이터가 없습니다(수정하려는 데이터 지정 오류)");
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("SQL 문에 문제가 있어 데이터 수정에 실패하였습니다 확인하세요. >> "+ e.getMessage());
			e.printStackTrace();
		}
		
		session.close();
	}

}
