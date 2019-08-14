package classTest;

public class arrTest {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };
		int[] copy = new int[arr.length];

		System.arraycopy(arr, 0, copy, 0, arr.length);
		for (int i = 0; i < copy.length; i++) {
			System.out.println("copy[" + i + "] = " + copy[i]);

		}
	}

}
