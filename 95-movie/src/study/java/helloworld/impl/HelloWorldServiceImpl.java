package study.java.helloworld.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.helloworld.model.Movie;
import study.java.helloworld.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService{
	private SqlSession session;
	
	public HelloWorldServiceImpl(SqlSession session) {
		this.session = session;
	}

	@Override
	public void addItem(Movie params) throws NullPointerException, Exception {
		
		List<Movie> list = session.selectList("MovieMapper.select_cheack",params);
		
		int count = 0;	
		
		if(list.size() == 0) {
			count = session.insert("MovieMapper.add_movie",params);
			System.out.println(count + " 건의 자료를 입력하였습니다.");
		}else {
			count = session.update("MovieMapper.update_movie",params);
			System.out.println("중복된 이름과 순위집계일의 자료가 이미 있어 " + count + " 건의 자료를 수정하였습니다.");
		}
		if(count==0) {
			throw new NullPointerException();
		}
		
		
 /*
		for(Movie item : list) {
			if(item.getMovieNm().equals(params.getMovieNm()) && params.getSearchDate().equals(item.getSearchDate())) {
				int row_count = session.update("MovieMapper.update_movie",params);
				System.out.println("중복된 이름과 순위집계일의 자료가 이미 있어 " + row_count + " 건의 자료를 수정하였습니다.");
				count++;
			} else {
				int row_count = session.insert("MovieMapper.add_movie",params);
				System.out.println(row_count + " 건의 자료를 입력하였습니다.");
				count++;
			}
			if(count==0) {
			throw new NullPointerException();
			}
		}
 */		
		 
	}

	@Override
	public List<Movie> getDailyList(Movie params) throws NullPointerException, Exception {
		//
		List<Movie> list = session.selectList("MovieMapper.select_daily_rank", params);
		if(list == null) {
			throw new NullPointerException();
		}
		return list;
	}

	@Override
	public List<Movie> getItemList(Movie params) throws NullPointerException, Exception {
		//
		List<Movie> list = session.selectList("MovieMapper.select_week_rank", params);
		if(list == null) {
			throw new NullPointerException();
		}
		return list;
	}

	@Override
	public void removeItem(Movie params) throws NullPointerException, Exception {
		// 
		int count = session.delete("MovieMapper.delete_movie_by_id",params);
		System.out.println(count + " 건의 데이터를 삭제하였습니다.");
		if(count == 0) {
			throw new NullPointerException();
		}
		
	}

	@Override
	public void removeDaily(Movie params) throws NullPointerException, Exception {
		//
		int count = session.delete("MovieMapper.delete_movie_by_rank",params);
		System.out.println(count + " 건의 데이터를 삭제하였습니다.");
		if(count == 0) {
			throw new NullPointerException();
		}
		
	}

	@Override
	public void removeMovie(Movie params) throws NullPointerException, Exception {
		//
		int count = session.delete("MovieMapper.delete_movie_by_keyword",params);
		System.out.println(count + " 건의 데이터를 삭제하였습니다.");
		if(count == 0) {
			throw new NullPointerException();
		}
	}
}
