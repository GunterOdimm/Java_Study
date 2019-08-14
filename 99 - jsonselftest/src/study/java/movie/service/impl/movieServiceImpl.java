package study.java.movie.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.movie.model.movie;
import study.java.movie.service.movieService;

public class movieServiceImpl implements movieService{
	
	private SqlSession session;
	
	public movieServiceImpl(SqlSession session) {
		this.session = session;
	}

	@Override
	public void addItem(movie params) throws NullPointerException, Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<movie> getDailyList(movie params) throws NullPointerException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<movie> getItemList(movie params) throws NullPointerException, Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
