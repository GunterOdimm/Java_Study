package study.java.movie.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConnectionFactory {
	//DB 접속 객체를 만들어준다.
	private static SqlSessionFactory sqlSessionFactory;
	
	//XML에 명시된 접속 정보를 읽어들인다.
	//클래스 초기화 블럭 : 클래스 변수의 복잡한 초기화에 사용된다.
	//이 블럭은 클래스가 처음 로딩될 때 한번만 수행된다.
	static {
		
		//이건 접속 정보를 명시하고 있는  XML경로를 읽어드리는 코드이다
		//다만 없을경우를 대비해 try catch를 강제한다
		try {
			Reader reader = Resources.getResourceAsReader("study/java/movie/dao/config.xml");
			
			//만약 SqlSessionFactory가 존재하지 않는다면 생성한다.
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//DB 접속 객체를 통해 DB에 접속한 세션을 리턴한다.
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
}
