package study.java.String;

public class Main02 {
	public static void main(String[] args) {
		String email = "student@java.com";

		int s = email.indexOf("@");
		
		String email_id = email.substring(0, s);
		String email_domain = email.substring(s + 1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
	}

}
