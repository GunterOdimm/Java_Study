package study.java.program;

public class main05 {
	public static void main(String[] args) {

		String[] src = { "가", "2", "aaa", "ccc" };

		int[] arr = new int[3];

		try {
			for (int i = 0; i < src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(arr[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("입력값을 숫자로만 입력하세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터의 양이 너무 많습니다");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다");
		} finally {
			// 이 블록은 예외의 발생 여부에 상관없이 무조건 실행.
			System.out.println("데이터 변환 종료");
		}

		System.out.println("---프로그램 종료 ---");
	}

}
