import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentSercive;
import study.java.myschool.service.impl.DepartmentServicelmpl;

public class Main18 {
	public static void main(String[] args) {
		Logger logger = LogManager.getFormatterLogger(Main18.class.getName());
		
		Department dept = new Department();
		dept.setDeptno(204);
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();
		
		DepartmentSercive departmentService = new DepartmentServicelmpl(session);
		
		
		try {
			departmentService.delectDepartment(dept);
			session.commit();
			session.close();
			
			//처리 결과를 로그에 기록하기
			logger.debug("데이터 삭제 완료");
		} catch (NullPointerException e) {
			logger.error("삭제 될 기록이 없습니다 학과 번호를 확인하세요");
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("SQL 구문에 심각한 문제가 있습니다 확인하세요. >> " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
