package classCall;

public class Calc {
	int puls(int x, int y) {
		return x + y;
	}
	int minus(int x, int y) {
		return x - y;
	}
	int times(int x, int y) {
		return x * y;
	}
	int divide(int x, int y) {
		String messege = "사용할수없습니다";
		if(x/y != 0) {
			return x/y;
		}else
			System.out.println(messege);
		return 0;
	}
}
