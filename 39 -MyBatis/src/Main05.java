import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.myschool.MyBatisConnectionFactory;
import study.java.myschool.model.Department;

public class Main05 {
	public static void main(String[] args) {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlsession();
		
		List<Department> result = sqlSession.selectList("DepartmentMapper.get_department_list");
		
		if(result == null) {
			System.out.println("조회결과 없음");
		} else {
			for(int i = 0; i<result.size(); i++) {
				Department item = result.get(i);
				System.out.println(item.toString());
			}
		}
		
		sqlSession.close();
	}

}
