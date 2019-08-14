
public class Monster implements Fight, Move {
	private String name;

	public Monster(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> 걷기시작 합니다.");
	}

	@Override
	public void run() {
		System.out.println(this.name + " >> 달리기 시작합니다.");
	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> 뛰기 시작합니다.");
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> 공격을 시작합니다.");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> 방어했습니다.");
	}

}
