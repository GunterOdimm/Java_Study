package study.java.movie.service;

import java.util.List;

import study.java.movie.model.movie;

public interface movieService {
	/*
	 * 영화 한편에 대한 순위 정보를 저장한다.
	 * 날짜와 제목이 일치한느 데이터가 이미 존재한다면 저장하지 않고 업데이트를 수행해야한다.
	 */
	
	public void addItem(movie params) throws NullPointerException, Exception;
	
	public List<movie> getDailyList(movie params) throws NullPointerException,Exception;
	
	public List<movie> getItemList(movie params) throws NullPointerException, Exception;
	
	
}
