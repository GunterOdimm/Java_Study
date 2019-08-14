package Study.java.program;

import java.util.Calendar;

public class main05 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);

		int[][] data = new int[week_count][7];

		int count = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (i == 0 && j < first_day - 1) {
					data[i][j] = 0;
				} else if (count > day_count) {
					data[i][j] = 0;
				} else {
					data[i][j] = count++;
				}

			}

		}

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (data[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.printf("%2d\t", data[i][j]);
				}

			}
			System.out.println();
		}

	}
}
