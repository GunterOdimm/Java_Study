package study.java.helper;

public class util {
	public static util utilST;

	public static util getInstance() {
		if (utilST == null) {
			utilST = new util();
		}
		return utilST;
	}

	private util() {

	}

	public int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}

}
