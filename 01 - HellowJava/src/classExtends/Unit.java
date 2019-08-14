package classExtends;

public class Unit {
	private String name; // 생성자

	public Unit(String name) {
		super();
		this.name = name;
	}// 생성자 정의

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void attack() {
		System.out.println(this.name + ">> 공격준비");
	}

}
