package study.java.program;
import study.java.helper.GsonHelper;
import study.java.model.MovieRank;

public class GsonHttp {
	public static void main(String[] args) {
		
		MovieRank result = null;
		
		try {
			result = (MovieRank) GsonHelper.getInstance().getJSONObject("http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=430156241533f1d058c603178cc3ca0e&targetDt=20120101", MovieRank.class);
		} catch (Exception e) {
			System.out.println("[Error]" +e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(result.toString());
	}
}
