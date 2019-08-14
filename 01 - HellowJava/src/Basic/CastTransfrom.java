package Basic;
import java.util.Scanner;

public class CastTransfrom {
	public static void main(String[] args) {
		// 상수를 정수로 바꾸는 프로그램

		double UserNumber;

		Scanner scan = new Scanner(System.in);

		System.out.println("원하는 상수값을 입력하시요 ex)3.14");
		UserNumber = scan.nextDouble();
		scan.close();
		int IntTransFrom = (int) UserNumber;

		System.out.println("당신이 입력한 값은 " + IntTransFrom + "으로 대체되었다.");

	}

}
