package study.java.hello.service.impl;

import java.util.Calendar;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import study.java.hello.service.MovierankService;
import study.java.helper.DatePrinter;
import study.java.helper.GsonHelper;
import study.java.model.MovieRank;
import study.java.model.MovieRank.BoxOfficeResult.DailyBoxOfficeList;
import study.java.model.movierank2;

public class MovierankServiceImpl implements MovierankService {
	private SqlSession session;

	public MovierankServiceImpl(SqlSession session) {
		this.session = session;
	}

	@Override
	public void addMovieRank(movierank2 params) throws NullPointerException, Exception {
		Calendar cal = Calendar.getInstance();
		DatePrinter dp = new DatePrinter();
		String date = dp.DatePrinter();
		MovieRank result = null;
		result = (MovieRank) GsonHelper.getInstance().getJSONObject(
				"http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt="+ date,MovieRank.class);
		List<DailyBoxOfficeList> list = result.getBoxOfficeResult().getDailyBoxOfficeList();
		List<movierank2>list1 = session.selectList("MovieMapper.select_equal",params);
		
		for (int i = 0; i < list.size(); i++) {
			MovieRank.BoxOfficeResult.DailyBoxOfficeList item = list.get(i);
			movierank2 model = new movierank2();

			model.setId(item.getId());
			model.setSearch_date(date);
			model.setRank(item.getRank());
			model.setRank_inten(item.getRank_inten());
			model.setRankOldAndNew(item.getRankOldAndNew());
			model.setMovie_cd(item.getMovie_cd());
			model.setMovie_nm(item.getMovie_nm());
			model.setOpen_dt(item.getOpen_dt());
			model.setSales_amt(item.getSales_amt());
			model.setSales_share(item.getSales_share());
			model.setSales_inten(item.getSales_inten());
			model.setSales_acc(item.getSales_acc());
			model.setAudi_cnt(item.getAudi_cnt());
			model.setAudi_inten(item.getAudi_inten());
			model.setAudi_change(item.getAudi_change());
			model.setAudi_acc(item.getAudi_acc());
			model.setScrn_cnt(item.getScrn_cnt());
			model.setShow_cnt(item.getShow_cnt());
			model.setReg_date("date");
			model.setEdit_date("date");

			System.out.println(model);
			if (list1.size() == 0) {
			session.insert("MovieRankMapper.insert_movierank", model);
			} else {
			session.update("MovieRankMapper.select_equal", model);
			}

		}

	}
	

	@Override
	public void delectMovieRank(movierank2 params) throws NullPointerException, Exception {
		movierank2 MR = new movierank2();
		MR.setMovie_nm(params.getMovie_nm());
		session.delete("MovieRankMapper.remove_movierank",params);
		
		MR.setSearch_date(params.getSearch_date());
		session.delete("MovieRankMapper.remove_movierank",params);
		
		MR.setId(params.getId());
		session.delete("MovieRankMapper.remove_movierank",params);
		
		
		
	}
}

