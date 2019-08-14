
public class Main00 {
	public static void main (String[] args) {
		People p = new People();
		People.Man man = p.new Man("진원", 27, true);
		
		People.Woman woman = new People.Woman("예지", 24);
		
		System.out.println(man.toString());
		System.out.println(woman.toString());
	}

}
