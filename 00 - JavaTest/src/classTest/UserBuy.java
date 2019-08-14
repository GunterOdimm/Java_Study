package classTest;

import java.util.Scanner;

public class UserBuy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("사려는 메뉴번호를 입력 하시오");
		System.out.println("1. 햄버거 3천원 2. 피자 1만 2천원");
		System.out.println("3. 리조또 5천원 4. 셋트 2만 3천원");

		int UserChoseMenu1 = scan.nextInt();
		if (UserChoseMenu1 > 4) {
			System.out.println("메뉴 선택이 잘못되었습니다 다시 시작해주세요");
		} else {
			System.out.println("지불하려는 금액을 입력하시오");

			int UserPayMoney1 = scan.nextInt();
			scan.close();

			int UserBuyMenu = UserBuyMenu(UserChoseMenu1, UserPayMoney1);
		}
	}

	public static int UserBuyMenu(int UserChoseMenu, int UserPayMoney) {

		int Change = 0;

		int 햄버거 = 3000;
		int 피자 = 12000;
		int 리조또 = 5000;
		int 셋트 = 23000;

		if (UserChoseMenu == 1) {
			if (UserPayMoney < 햄버거) {
				System.out.println("금액이 부족합니다");
			} else if (UserPayMoney > 햄버거) {
				Change = UserPayMoney - 햄버거;
				System.out.println("잔돈은 " + Change + "입니다");
			}
		}
		if (UserChoseMenu == 2) {
			if (UserPayMoney < 피자) {
				System.out.println("금액이 부족합니다");
			} else if (UserPayMoney > 피자) {
				Change = UserPayMoney - 피자;
				System.out.println("잔돈은 " + Change + "입니다");
			}
		}
		if (UserChoseMenu == 3) {
			if (UserPayMoney < 리조또) {
				System.out.println("금액이 부족합니다");
			} else if (UserPayMoney > 리조또) {
				Change = UserPayMoney - 리조또;
				System.out.println("잔돈은 " + Change + "입니다");
			}
		}
		if (UserChoseMenu == 4) {
			if (UserPayMoney < 셋트) {
				System.out.println("금액이 부족합니다");
			} else if (UserPayMoney > 셋트) {
				Change = UserPayMoney - 셋트;
				System.out.println("잔돈은 " + Change + "입니다");
			}
		}
		return 0;
	}
}