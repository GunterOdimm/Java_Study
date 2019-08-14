package study.java.myschool;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {
	
	//데이터베이스 접속 객체
	private static SqlSessionFactory sqlSessionFactory;
	
	/*
	 * XML에 명시된 접속 정보를 읽어들인다.
	 * 클래스 초기화 블럭 : 클래스변수의 복잡한 초기화에 사용된다.
	 * 클래스가 처음 로딩될 때 한번마 수행된다.
	 */
	static {
		/*
		 * 접속 정보를 명시하고 있는 XML의 경로 읽기
		 */
		try {
			Reader reader = Resources.getResourceAsReader("study/java/myschool/config.xml");
			
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static SqlSession getSqlsession() {
		return sqlSessionFactory.openSession();
	}

}
