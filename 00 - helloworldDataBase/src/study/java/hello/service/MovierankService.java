package study.java.hello.service;

import study.java.model.MovieRank;
import study.java.model.movierank2;

public interface MovierankService {
	
	public void addMovieRank(movierank2 params)
		throws NullPointerException, Exception;
	public void delectMovieRank(movierank2 params)
		throws NullPointerException, Exception;
	
}
