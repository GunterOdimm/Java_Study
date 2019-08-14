package Basic;
import java.util.Scanner;

public class boolean_test {

	public static void main(String[] args) {

		int userAge;

		System.out.println("당신의 나이를 입력하세요 :");

		Scanner scan = new Scanner(System.in);
		userAge = scan.nextInt();
		scan.close();

		boolean IsAdult = userAge > 19;
		System.out.println(IsAdult);

	}

}
