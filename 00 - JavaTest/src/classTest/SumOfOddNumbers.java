package classTest;
import java.util.Scanner;

public class SumOfOddNumbers {
	public static void main(String[] args) {

		int sum = 0;

		System.out.println("원하는 홀수 합의 범위를 지정해주세요 ex) 100 ");
		Scanner scan = new Scanner(System.in);
		int UserNumber = scan.nextInt();
		scan.close();

		for (int i = 0; i <= UserNumber; i++) {
			if (i % 2 != 0) {
				sum += i;

			} // if 문 종결

		} // for문 종결
		System.out.println(sum);
	}// 메인

}
