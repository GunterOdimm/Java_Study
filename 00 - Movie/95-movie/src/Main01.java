import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;

import study.java.helloworld.MyBatisConnectionFactory;
import study.java.helloworld.impl.HelloWorldServiceImpl;
import study.java.helloworld.model.Movie;
import study.java.helloworld.model.Movie_Json;
import study.java.helloworld.model.Movie_Json.BoxOfficeResult.DailyBoxOfficeList;
import study.java.helloworld.service.HelloWorldService;
import study.java.helper.GsonHelper;

public class Main01 {

	/*
	 문제 3
	 오늘 날짜를 기준으로 하루 전에 해당하는 순위 데이터를 HTTP 방식으로 연동하여 
	 그 결과를 DB에 저장하는 Main Class를 작성하시오.
	 */
	public static void main(String[] args) {
		// 
		SqlSession session = MyBatisConnectionFactory.getSqlSession();
		HelloWorldService service = new HelloWorldServiceImpl(session);
		
		Calendar cal = Calendar.getInstance();	// 캘린더는 현재 날짜를 알려줌.
		cal.add(Calendar.DATE, -1);	//하루 전 날짜
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String date = sdf.format(cal.getTime());

		Calendar reg_dt = Calendar.getInstance(); // 등록일시를 알려줄 날짜.
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd : hh:mm:ss");
		String reg_date = sf.format(reg_dt.getTime());

		String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=d7166c42aceee33fcd96d255f6d984c7&targetDt=" + date;

		Movie_Json result = null;
		
		try {
			result = (Movie_Json) GsonHelper.getInstance().getJSONObject(url, Movie_Json.class);
			
			for(DailyBoxOfficeList movie_json : result.getBoxOfficeResult().getDailyBoxOfficeList()) {
				Movie movie = new Movie();
				movie.setId(Integer.parseInt(movie_json.getRnum()));
				movie.setSearchDate(date);
				movie.setRank(Integer.parseInt(movie_json.getRank()));
				movie.setRankInten(Integer.parseInt(movie_json.getRankInten()));
				movie.setRankOldAnd_new(movie_json.getRankOldAndNew());
				movie.setMovieCd(movie_json.getMovieCd());
				movie.setMovieNm(movie_json.getMovieNm());
				movie.setOpenDt(movie_json.getOpenDt());
				movie.setSalesAmt(Long.parseLong(movie_json.getSalesAmt()));
				movie.setSalesShare(Float.parseFloat(movie_json.getSalesShare()));
				movie.setSalesInten(Long.parseLong(movie_json.getSalesInten()));
				movie.setSalesChange(Float.parseFloat(movie_json.getSalesChange()));
				movie.setSalesAcc(Long.parseLong(movie_json.getSalesAcc()));
				movie.setAudiCnt(Integer.parseInt(movie_json.getAudiCnt()));
				movie.setAudiInten(Long.parseLong(movie_json.getAudiInten()));
				movie.setAudiChange(Float.parseFloat(movie_json.getAudiChange()));
				movie.setAudiAcc(Integer.parseInt(movie_json.getAudiAcc()));
				movie.setScrnCnt(Integer.parseInt(movie_json.getScrnCnt()));
				movie.setShowCnt(Integer.parseInt(movie_json.getShowCnt()));
				movie.setRegDate(reg_date);
				movie.setEditDate(reg_date);
				
				service.addItem(movie);
				session.commit();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		session.close();

	}

}
//사용할 url
//http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=d7166c42aceee33fcd96d255f6d984c7&targetDt=
