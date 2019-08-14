package SelfTest;

import java.util.Scanner;

public class UserBuy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<=1 ; i++){
		
		System.out.println("사려는 메뉴번호를 입력 하시오");
		System.out.println("1. 햄버거 3천원 2. 피자 1만 2천원");
		System.out.println("3. 리조또 5천원 4. 셋트 2만 3천원");

		int UserChoseMenu1 = scan.nextInt();
		if (UserChoseMenu1 > 4 || UserChoseMenu1 <= 0) {
			System.out.println("메뉴 선택이 잘못되었습니다 다시 시작해주세요");
			i--;
		} else {
			System.out.println("지불하려는 금액을 입력하시오");

			int UserPayMoney1 = scan.nextInt();

			int UBM = UserBuyMenu.UserBuyMenu(UserChoseMenu1, UserPayMoney1);
		
			}
		}
		scan.close();
}
}