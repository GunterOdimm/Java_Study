import study.java.helper.GsonHelper;
import study.java.model.GradeList;

public class GsonHttp {
	public static void main(String[] args) {
		
		GradeList result = null;
		
		try {
			result = (GradeList) GsonHelper.getInstance().getJSONObject("", GradeList.class);
		} catch (Exception e) {
			System.out.println("[Error]" +e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(result.toString());
	}
}
