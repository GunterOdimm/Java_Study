package study.java.String;

public class main03 {
	public static void main(String [] args) {
		String idNumber = "9310071042110";
		
		String yy = idNumber.substring(0,2);
		String mm = idNumber.substring(2,4);
		String dd = idNumber.substring(4,6);
		String gender_code = idNumber.substring(6,7);
		
		if(gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;
		}else {
			yy = "20" + yy;
		}
		
		String gender = "남자";
		
		if(gender_code.equals("2") || gender_code.equals("4")) {
			gender = "여자";
		}
		System.out.printf("%s년 %s월 %s일 %s", yy, mm, dd, gender);
		
	}

}
