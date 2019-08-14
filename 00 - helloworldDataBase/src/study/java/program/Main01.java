package study.java.program;

import org.apache.ibatis.session.SqlSession;

import study.java.Sql.MyBatisConnectionFactory;
import study.java.hello.service.MovierankService;
import study.java.hello.service.impl.MovierankServiceImpl;
import study.java.model.movierank2;

public class Main01 {
	public static void main(String[] args) {
		
		SqlSession session = MyBatisConnectionFactory.getSqlsession();

		MovierankService add = new MovierankServiceImpl
				(session);
		movierank2 movie = new movierank2();
		try {
			add.addMovieRank(movie);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		session.commit();
		session.close();
		System.out.println("데이터 입력이 성공했습니다");

	}

}
