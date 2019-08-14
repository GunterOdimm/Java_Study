
public class DungeonCrawl {
	public static void main(String[] args) {
		Character ch = new Character("무명인");
		ch.attack();
		ch.jump();
		ch.attack();
		ch.shield();
		ch.pickUp();

		System.out.println("-------------------");

		Monster mon = new Monster("고블린");
		mon.run();
		mon.attack();
		mon.run();
		mon.attack();

		System.out.println("고블린이 죽었습니다");

	}

}
