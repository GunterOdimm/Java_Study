package classExtends;

public class Plus_num {

	public static void main(String[] args) {
		int a = 100;
		int x = 1;
		int b = 1;
		int y = a + x++;
		int z = a + ++b;
		System.out.println(y);
		System.out.println(b);
		System.out.println(z);

	}

}
