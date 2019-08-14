package ObjectTypeConversion;

public class AirForce extends Unit {
	public AirForce(String name) {
		super(name);/*
					 * ConstructorOverride 에서 존재하는 생성자를 호출
					 */
	}

	public void attack() {
		System.out.println(super.getName() + ">> 공중폭격 실행");// Override될 attack메서드 생성.
	}

	public void FighterPlane() {
		System.out.println(super.getName() + ">> 전투기폭격");
	}

	@Override
	public void move() {
		System.out.println(super.getName() + ">> 공중 전투기 전술 이동 ");

	}
}
