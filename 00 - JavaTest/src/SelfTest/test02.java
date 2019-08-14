package SelfTest;

public class test02 {
	public static int div (int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("0으로 못나눔");
			
		}
		return x/y;
	}

}
