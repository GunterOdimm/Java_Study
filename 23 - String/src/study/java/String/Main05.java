package study.java.String;

public class Main05 {
	public static void main(String[] args) {
		String data = "D:/photo/2014/travel/doos.jpg";
		
		String name = data.substring(data.lastIndexOf("/") + 1, data.lastIndexOf("."));
		System.out.println("파일 이름  : " + name);
	}

}
