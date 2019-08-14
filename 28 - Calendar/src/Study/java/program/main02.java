package Study.java.program;

import java.util.Calendar;

import Study.java.help.DatePrinter;

public class main02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDtaTime(cal);

		cal.add(Calendar.DAY_OF_MONTH, 100);
		DatePrinter.printDtaTime(cal);

		cal.add(Calendar.YEAR,-75);
		DatePrinter.printDtaTime(cal);

		cal.add(Calendar.HOUR, 9);
		DatePrinter.printDtaTime(cal);

		cal.add(Calendar.MONTH, 8);
		DatePrinter.printDtaTime(cal);
		
		
	}

}
