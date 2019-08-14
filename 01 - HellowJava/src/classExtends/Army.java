package classExtends;

public class Army extends Unit {
	public Army(String name) {
		super(name);/*
					 * ConstructorOverride 에서 존재하는 생성자를 호출
					 */
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">> 지상공격 실행함");// Override될 attack메서드 생성.
	}

	public void tank() {
		System.out.println(super.getName() + ">> 탱크공격");
	}
}
