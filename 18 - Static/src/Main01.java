
public class Main01 {
	public static void main(String[] args) {
		
		CalcSingleTon loader1 = CalcSingleTon.getInstance();
		loader1.plus(100, 200);
		
		CalcSingleTon.getInstance().minus(300, 150);
	}

}
