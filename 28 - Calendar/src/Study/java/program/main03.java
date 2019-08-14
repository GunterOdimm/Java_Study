package Study.java.program;

import java.util.Calendar;
import Study.java.help.DatePrinter;

public class main03 {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		System.out.println("최초로 받아온 시간입니다");
		DatePrinter.printDtaTime(cal);
		
		//특정 날짜로 지정하는 법1
		cal.set(Calendar.YEAR, 2040);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		DatePrinter.printDtaTime(cal);

		//특정 날짜로 지정하는 법 2
		cal.set(1982, 05, 17);
		DatePrinter.printDtaTime(cal);

		//특정 날짜로 지정하는 법 3(시,분,초 포함 > 24시간제만 가능함)
		cal.set(1982, 05, 17, 8, 02, 03);
		DatePrinter.printDtaTime(cal);

		//년,월,시,분,초는 가만히 두고 , 날짜만 1일로 변경하는경우
		cal.set(Calendar.DAY_OF_MONTH, 1);
		DatePrinter.printDtaTime(cal);
	}

}
