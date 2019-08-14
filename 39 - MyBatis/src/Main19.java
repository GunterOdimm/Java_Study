import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentSercive;
import study.java.myschool.service.impl.DepartmentServicelmpl;

public class Main19 {
	public static void main(String[] args) {
		
		Logger logger = LogManager.getFormatterLogger(Main19.class.getName());

		Department dept = new Department();
		dept.setDeptno(201);
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();

		DepartmentSercive departmentSercive = new DepartmentServicelmpl(session);
		
		Department item = null;
		
		try {
			item = departmentSercive.getDepartment(dept);
			
			logger.debug("조회된 데이터 >> : " + item.toString());
		} catch (NullPointerException e) {
			logger.error("조회된 데이터가 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("SQL 문에 심각한 오류가 있습니다 확인하세요." + e.getMessage());
			e.printStackTrace();
		}
		session.close();
		
	}

}
