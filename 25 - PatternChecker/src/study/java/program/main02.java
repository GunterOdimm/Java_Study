package study.java.program;

import study.java.helper.RegexHelper;

public class main02 {
	public static void main(String[] args) {
		
		String name = "서진원";
		String age = "27";
		String email = "sejew93@gmail.com";
		String phone = "01085766207";
		
		if(!RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름은 한글로만 적어주세요.");
			return;
		}
		if(!RegexHelper.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로만 적어주세요.");
			return;
		}
		if(!RegexHelper.getInstance().isEmail(email)) {
			System.out.println("이메일이 잘못된 형식입니다 적어주세요.");
			return;
		}
		if(!RegexHelper.getInstance().isCellPhone(phone)) {
			System.out.println("핸드폰 번호를 올바르게 적어주세요.");
			return;
		}
		System.out.println("회원가입 절차를 진행합니다");
	}

}
