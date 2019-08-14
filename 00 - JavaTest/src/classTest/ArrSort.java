package classTest;

public class ArrSort {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 4, 2, 5 };

		for (int i = 0; i < arr.length / 2; i++) {
			// 역순 정리임으로 중앙은 움직이지 않아도 된다
			// 길이의 절반만 움직이면 됨.
			int temp = arr[i];
			// 배열의 값을 저장하기 위한 임시 변수 선언
			arr[i] = arr[(arr.length - 1) - i];
			arr[(arr.length - 1) - i] = temp;
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}

}
