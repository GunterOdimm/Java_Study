package classTest;
public class BoolReversed {

	public static void main(String[] args) {
		boolean[] CheckList = { true, false, false, true, false };

		System.out.println("---------before----------");
		printArray(CheckList);

		for (int i = 0; i < CheckList.length; i++) {
			if (CheckList[i] == true) {
				CheckList[i] = false;

			} else {
				CheckList[i] = true;
			}
		}

		System.out.println("---------after----------");
		printArray(CheckList);
	}

	public static void printArray(boolean[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);

			if (i + 1 < data.length) {
				System.out.println(",");
			}
		}
		System.out.println();
	}
}