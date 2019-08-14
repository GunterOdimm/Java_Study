package SelfTest;

public class UserBuyMenu {
	public static int UserBuyMenu(int UserChoseMenu, int UserPayMoney) {

		int Change = 0;

		int 햄버거 = 3000;
		int 피자 = 12000;
		int 리조또 = 5000;
		int 셋트 = 23000;

		for (int i = 0; i < 1; i++) {
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
		}
		return 0;
	}
}

