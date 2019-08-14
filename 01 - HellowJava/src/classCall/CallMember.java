package classCall;

public class CallMember {

	public static void main(String[] args) {
		Member m0 = new Member();
		Member m1 = new Member();
		m0.setName("서진원");
		m0.setAge(27);
		m0.say();
		m1.setName("이다영");
		m1.setAge(25);
		m1.say();

	}

}
