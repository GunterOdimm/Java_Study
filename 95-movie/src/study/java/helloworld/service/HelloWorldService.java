package study.java.helloworld.service;

import java.util.List;

import study.java.helloworld.model.Movie;

public interface HelloWorldService {
	/**
	 * 영화 한편에 대한 순위 정보를 저장한다.
	 * 날짜와 제목이 일치하는 데이터가 이미 존재한다면 저장하지 않고 업데이트를 수행해야 한다.
	 * @param params
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public void addItem(Movie params) throws NullPointerException, Exception;

	/**
	 * 특정 날짜에 대한 순위목록을 조회한다.
	 * @param params - 날짜의 값을 가져오는 빈즈
	 * @return - 목록 반환
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public List<Movie> getDailyList(Movie params) throws NullPointerException, Exception;

	/**
	 * 특정 영화 제목에 대한 최근 1주일간의 순위 내역을 날짜순으로 조회한다.
	 * @param params 
	 * @return - 목록 반환
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public List<Movie> getItemList(Movie params) throws NullPointerException, Exception;
	
	/**
	 * 일련번호를 기준으로 특정 데이터 한 건을 삭제한다.
	 * @param params - 일련번호를 담은 빈즈
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public void removeItem(Movie params) throws NullPointerException, Exception;
	
	/**
	 * 특정 날짜에 대한 순위 데이터를 모두 삭제한다.
	 * @param params - 날짜정보를 담은 빈즈
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public void removeDaily(Movie params) throws NullPointerException, Exception;
	
	/**
	 * 특정 단어가 포함된 제목을 갖는 모든 영화를 삭제한다.
	 * @param params - 단어를 담은 빈즈
	 * @throws NullPointerException
	 * @throws Exception
	 */
	public void removeMovie(Movie params) throws NullPointerException, Exception;
}
