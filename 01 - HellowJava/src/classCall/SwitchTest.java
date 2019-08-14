package classCall;
import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("당신의 수학 시험점수를 알려주세요 (5점 단위) : ");
		int TestResult1 = scan.nextInt();
		scan.close();

		switch (TestResult1) {
		case 95:
		case 100:
			System.out.println("A+ 입니다");
			break;
		case 90:
		case 85:
			System.out.println("A 입니다");
			break;
		case 80:
		case 75:
			System.out.println("B+ 입니다");
			break;
		case 70:
		case 65:
			System.out.println("B 입니다");
			break;
		case 60:
		case 55:
		case 45:
		case 40:
		case 35:
		case 30:
		case 25:
		case 20:
		case 15:
		case 10:
		case 5:
		case 0:
			System.out.println("낙제 점수 입니다 재시험을 해주세요");
			break;
		}
	}

}
