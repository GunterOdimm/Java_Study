package study.java.program;

public class main03 {
	public static void main(String[] args) {
		String Year1 = "1980";
		int age1 = 2014 - Integer.parseInt(Year1) + 1;
		System.out.println("유저 1의 나이는 : " + age1);
		// 문제가 없다 정상적인 기입방법

		try {
			String Year2 = "뭘까요?";
			int age2 = 2014 - Integer.parseInt(Year2) + 2;
			System.out.println(age2);
			// 변환이 불가능해 아예 에러가나 프로그램이 멈춘다
		} catch (NumberFormatException e) {
			// 에러를 만나면 catch로 무조건 블록으로 점프한다
			// 평소보다 많은량의 메모리를 사용함 남발 금지
			System.out.println("글자가 아닌 숫자만 입력해 주세요");
			System.out.println("원인 : " + e.getMessage());
		}

		System.out.println("----프로그램을 종료합니다----");
	}

}
