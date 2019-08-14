package ObjectTypeConversion;

public class Army extends Unit {
	public Army(String name) {
		super(name);/*
					 * ConstructorOverride 에서 존재하는 생성자를 호출
					 */
	}

	public void attack() {
		System.out.println(super.getName() + ">> 지상공격 실행");// Override될 attack메서드 생성.
	}

	public void tank() {
		System.out.println(super.getName() + ">> 탱크공격");
	}

	@Override
	public void move() {
		System.out.println(super.getName() + ">> 육군 전술 타격 이동 ");

	}
}
