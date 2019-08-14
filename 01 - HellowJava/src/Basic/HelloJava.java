package Basic;

public class HelloJava {

	public static void main(String[] args) {
		System.out.println(덧셈(100, 200));
		// 이것은 주석문입니다.
		
		int[] a = {1,2,3};
		int[] b = a;
		b[0] = 100;
		System.out.println(a[0]);
		//배열의 복사는 단순 참조다 즉 원본이 바뀌면 복사값이 같다.
		// 배열은 다시말하지만 주소값이다. 주소를 보는것이니까 값을바꾸면 바뀜.
	}

	public static int 덧셈(int 첫번째, int 두번째) {
		int 결과 = 첫번째 + 두번째;
		return 결과;
	}
}
