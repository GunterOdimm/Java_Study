package OverLoad;

public class OverLoadMain {
	public static void main(String[] args) {
		OverLoad a1 = new OverLoad(1);
		System.out.println(a1.toString());
		
		OverLoad a2 = new OverLoad(1,"게시물 001");
		System.out.println(a2.toString());
		
		OverLoad a3 = new OverLoad(1,"게시물 002","서진원");
		System.out.println(a3.toString());
	}

}
