
public class Character implements Action, Move, Fight {

	private String name;

	public Character(String name) {
		this.name = name;
	}

	@Override
	public void attack() {
		System.out.println(this.name + " >> 공격을 합니다.");
	}

	@Override
	public void shield() {
		System.out.println(this.name + " >> 방어를 했습니다.");
	}

	@Override
	public void walk() {
		System.out.println(this.name + " >> 걷기시작했습니다.");
	}

	@Override
	public void run() {
		System.out.println(this.name + " >> 달리기를 시작합니다.");
	}

	@Override
	public void jump() {
		System.out.println(this.name + " >> 뛰었습니다.");
	}

	@Override
	public void pickUp() {
		System.out.println(this.name + " >> 루팅을 시작합니다");
	}

}
