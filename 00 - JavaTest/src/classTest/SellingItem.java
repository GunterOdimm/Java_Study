package classTest;

public class SellingItem {
	public static void main(String[] args) {
		int[][] Inven = { { 500, 320, 100, 120, 92, 30 }, { 291, 586, 460, 558, 18, 72 } };

		int Total = 0;
		for(int i= 0; i<Inven[0].length;i++) {
			Total += (int)(Inven[0][i] * 0.9 * Inven[1][i]);
		}

		System.out.println("총 골드의 합 " + Total + "G");

	}

}
