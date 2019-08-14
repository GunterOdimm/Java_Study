package classCall;
public class LetsDoTheMath {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		int TestNumber0 = c.puls(100, 175);
		int TestNumber1 = c.minus(300, 120);
		int TestNumber2 = c.divide(TestNumber0, TestNumber1);

		System.out.println("100 + 175 = " + TestNumber0);
		System.out.println("300 - 120 = " + TestNumber1);
		System.out.println(TestNumber0 + " / "+TestNumber1+" = " + TestNumber2);
		
	}

}
