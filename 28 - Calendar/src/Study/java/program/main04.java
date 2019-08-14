package Study.java.program;

import Study.java.help.DatePrinter;
import java.util.Calendar;

public class main04 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("요일 인덱스 = " + day);

		String[] day_name = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println("요일 = " + day_name[day - 1]);

		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		System.out.println("이번 달은" + week_count + "주로 되어 있다.");

		int day_count = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
		System.out.println("이번 달은 " + day_count + "일 까지 있다.");

		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("이번 달의 시작 요일 인덱스 = " + first_day);
		System.out.println("이번 달의 시작 요일 = " + day_name[first_day - 1]);
	}

}
