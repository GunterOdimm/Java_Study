package study.java.helper;

public class Util {
	public static Util utilST;

	public static Util getInstance() {
		if (utilST == null) {
			utilST = new Util();
		}
		return utilST;
	}

	private Util() {

	}

	public int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}

}
