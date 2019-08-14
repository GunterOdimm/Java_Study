package SelfTest;

public class test021 {
	public static void main(String[] args) {
		
		try {
			int x = test02.div(100,0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
