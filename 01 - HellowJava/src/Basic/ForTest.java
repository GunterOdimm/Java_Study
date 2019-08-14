package Basic;
import java.util.Scanner;

public class ForTest {
	// for 문으로 기억하는 구구단
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 구구단을 입력하세요 : (단 최대 10회 반복합니다)");
		scan.close();
		int googoobaan = scan.nextInt();
		int googoobaanResult;
		for (int i = 1; i < 10; i++) {
			googoobaanResult = googoobaan * i;
			System.out.println(googoobaan + " * " + i + " = " + googoobaanResult);
		}

	}

}
