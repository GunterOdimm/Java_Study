package ObjectTypeConversion;

public class Navy extends Unit {
	public Navy(String name) {
		super(name);/*
					 * ConstructorOverride 에서 존재하는 생성자를 호출
					 */
	}

	public void attack() {
		System.out.println(super.getName() + ">> 해상공격 실행");// Override될 attack메서드 생성.
	}

	public void AircraftCarrier() {
		System.out.println(super.getName() + ">> 항공모함공격");
	}

	@Override
	public void move() {
		System.out.println(super.getName() + ">> 해상 폭격 이동 ");

	}
}
