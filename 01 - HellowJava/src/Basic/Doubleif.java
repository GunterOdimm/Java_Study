package Basic;

public class Doubleif {
	public static void main(String[] args) {

		for (int a = 1; a < 10; a++) {
			for (int i = 1; i < 10; i++) {
				if (i < 10) {
					int googoo = a * i;
					System.out.println(googoo);

				} // if문 종결

			} // for문 종결
			if (a < 9) {
				System.out.println("------------");
			}

		} // 최초 for문 종결

	}// 메인

}
