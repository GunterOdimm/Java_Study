package study.java.movierank.service;

import java.util.List;

import study.java.movierank.model.SearchDailyBoxOfficeList;

public interface MovieRankService {
	public List<SearchDailyBoxOfficeList> getMovieWeeklyRank() throws Exception;

	public void addItem(SearchDailyBoxOfficeList movie) throws Exception;

	public List<SearchDailyBoxOfficeList> getDailyList(SearchDailyBoxOfficeList movie) throws Exception;

	public List<SearchDailyBoxOfficeList> getItemList(SearchDailyBoxOfficeList movie) throws Exception;

	public void removeItem(SearchDailyBoxOfficeList movie) throws Exception;

	public void removeDaily(SearchDailyBoxOfficeList movie) throws Exception;

	public void removeMovie(SearchDailyBoxOfficeList movie) throws Exception;

}
