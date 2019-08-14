package classTest;
import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 수학 시험점수를 알려주세요");
		int point1 = scan.nextInt();

		System.out.println("당신의 국어 시험점수를 알려주세요");
		int point2 = scan.nextInt();

		System.out.println("당신의 영어 시험점수를 알려주세요");
		int point3 = scan.nextInt();

		int ResultPoint = (point1 + point2 + point3) / 3;
		scan.close();
		if (ResultPoint > 100) {
			System.out.println("수치 입력이 잘못되었습니다 다시 입력해주세요");
		} else {
			System.out.println("당신의 평균점수는" + ResultPoint + "이며");
			{
				if (ResultPoint > 95) {
					System.out.println("학점은 a+ 입니다. 수고하셨습니다");
				} else if (ResultPoint > 90) {
					System.out.println("학점은 a 입니다. 수고하셨습니다");
				} else if (ResultPoint > 85) {
					System.out.println("학점은 b+ 입니다. 수고하셨습니다");
				} else if (ResultPoint > 75) {
					System.out.println("학점은 b 입니다. 수고하셨습니다");
				} else if (ResultPoint > 70) {
					System.out.println("학점은 c+ 입니다. 수고하셨습니다");
				} else if (ResultPoint > 65) {
					System.out.println("학점은 c 입니다. 수고하셨습니다");
				} else if (ResultPoint > 60) {
					System.out.println("낙제입니다 재시험을 응해주세요 ");

				}
			}

		}
	}
}
