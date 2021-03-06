import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.model.Professor;
import study.java.myschool.service.impl.DepartmentServicelmpl;
import study.java.myschool.service.impl.ProfessorServiceimpl;
import study.java.myschool.services.DepartmentService;
import study.java.myschool.services.ProfessorService;

public class Main8 {
	public static void main(String[] args) {
		Logger logger = LogManager.getFormatterLogger(Main8.class.getName());
		
		Professor pro = new Professor();
		pro.setDeptno(203);
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();
		
		ProfessorService departmentService = new ProfessorServiceimpl(session);
		
		
		try {
			ProfessorService.delectProfessor(pro);
			session.commit();
			session.close();
			
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
