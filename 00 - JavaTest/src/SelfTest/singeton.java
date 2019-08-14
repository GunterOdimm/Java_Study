package SelfTest;

public class singeton {
	private static singeton t1;
	
	public static singeton getinstane() {
		if(t1 == null){
			t1 = new singeton();
		}
		
		return t1;
		
	}
	private singeton() {
		
	}
	public static void freeinstance(){
		t1 = null;
	}
}
