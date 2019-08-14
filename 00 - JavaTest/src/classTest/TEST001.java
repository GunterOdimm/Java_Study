package classTest;
import java.util.Scanner;

public class TEST001 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double StandardWeight = 0;
		System.out.println("사용자의 몸무게를 입력해주세요");
		double UserWight = scan.nextDouble();

		System.out.println("사용자의 키를 입력해주세요");
		double UserHeight = scan.nextDouble();
		scan.close();
		if (UserHeight <= 150) {
			StandardWeight = UserHeight - 110;
		} else if (UserHeight >= 151) {
			StandardWeight = (UserHeight - 110) * 0.9;
		}
		double obesity = (UserWight - StandardWeight) / StandardWeight * 100;

		if (obesity <= 20) {
			System.out.println("정상(안심)");
		} else if (obesity > 20 && obesity <= 30) {
			System.out.println("경도비만(주의)");
		} else if (obesity > 30 && obesity <= 50) {
			System.out.println("중등도 비만 (위험)");
		} else if (obesity > 20 && obesity <= 30) {
			System.out.println("고도비만 (매우위험)");
		}

	}

}
