package classTest;

public class SortMin {
	public static void main(String[] args) {
		int[] Price = { 209000, 109000, 119000, 109000, 94000 };

		System.out.print("상품가격 나열  -->");
		for (int i = 0; i < Price.length; i++) {
			System.out.print(Price[i]);
			/*
			 * 배열의 인덱스 +1이 배열의 길이보다 작다는 조건은 배열의 마지막 항목을 제외한 나머지에 대한 처리가 가능하다.
			 */

			if (i + 1 < Price.length) {
				System.out.print(",");
			}
		}
		System.out.println("");
		for (int i = 0; i < Price.length - 1; i++) {
			for (int j = i + 1; j < Price.length; j++) {
				if (Price[i] > Price[j]) {
					int Temp = Price[i];
					Price[i] = Price[j];
					Price[j] = Temp;
				}
			}
		}
		System.out.print("낮은가격순 -->");
		for (int i = 0; i < Price.length; i++) {
			System.out.print(Price[i]);
			if (i + 1 < Price.length) {
				System.out.print(",");
			}
		}
	}

}
