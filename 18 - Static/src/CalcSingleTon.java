
public class CalcSingleTon {
	private static CalcSingleTon c1;

	public static CalcSingleTon getInstance() {
		if (c1 == null) {
			c1 = new CalcSingleTon();
		}
		return c1;
	}

	private CalcSingleTon() {

	}

	public void plus(int x, int y) {
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}

	public void minus(int x, int y) {
		int z = x - y;
		System.out.println(x + " - " + y + " = " + z);

	}

}
