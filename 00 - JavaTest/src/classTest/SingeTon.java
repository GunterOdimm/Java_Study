package classTest;


public class SingeTon{
	private static SingeTon c1;
	public static SingeTon getInstance() {
		if(c1 == null) {
			c1 = new SingeTon();
		}
		return c1;
	}
	private SingeTon() {
		
	}
}