package classTest;
import java.util.Scanner;

public class MakePyramids {
	public static void main(String[] args) {
		System.out.print("만들고싶은 피라미드의 층수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < num; i++) {
		    for (int j = 1; j < num - i; j++) {
		        System.out.print(" ");
		    }
		    for (int k = 0; k < i * 2 + 1; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}


	}

}
