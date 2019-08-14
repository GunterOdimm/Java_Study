package study.java.myschool;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		
		try {
			Reader reader = Resources.getResourceAsReader("study/java/myschool/config.xml");
			System.out.println("[INFO] 성공적으로 로그인 되었습니다.");
			
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
				}
		} catch (IOException e) {
			System.out.println("[INFO] xml의 경로가 잘못되었습니다 확인하세요.");
			e.printStackTrace();
		}
	}

	public static SqlSession getSqlsession() {
		return sqlSessionFactory.openSession();
	}

}
