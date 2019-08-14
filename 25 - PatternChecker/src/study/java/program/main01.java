package study.java.program;

import study.java.helper.RegexHelper;

public class main01 {
	public static void main(String[] args) {
		
		String name = "서진원";
		String age = "27";
		String email = "sejew93@gmail.com";
		String phone = "01085766207";
		
		//정규표현식을 사용하여 입력값 형식 검사
		if(!RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름은 한글로 입력해 주세요.");
			return;
		}
		System.out.println("회원가입 절차를 진행합니다");
	}

}
