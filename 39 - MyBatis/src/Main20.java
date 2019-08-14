import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;
import study.java.myschool.service.DepartmentSercive;
import study.java.myschool.service.impl.DepartmentServicelmpl;

public class Main20 {
	public static void main(String[] args) {
		Logger logger = LogManager.getFormatterLogger(Main20.class.getName());
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();
		
		DepartmentSercive departmentSercive = new DepartmentServicelmpl(session);
		
		List<Department> list = null;
		
		try {
			list = departmentSercive.getDepartmentList();
			
			for (int i = 0; i<list.size(); i++) {
				Department temp = list.get(i);
				logger.debug(String.format("조회결과[%d] >> %s", i, temp.toString()));
			}
			
		} catch (NullPointerException e) {
			logger.error("조회된 데이터가 없습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			logger.error("데이터 조회에 실패했습니다. " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
