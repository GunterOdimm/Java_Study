package classTest;
class Student{
	String name = "이름을 입력하세요";
	int age = 0;
}
public class classTest {
	public static void main (String[] args) {
		Student std;
		std = new Student();

		System.out.println("이름 : " +std.name);
		System.out.println("나이 : " +std.age);
	}

}
