package ObjectTypeConversion;

public class WarGame {
	public static void main(String[] args) {
		// 부대지정
		Unit[] units = new Unit[5];

		units[0] = new AirForce("공군1호");
		units[1] = new Army("공군2호");
		units[2] = new Army("육군1호");
		units[3] = new Army("육군3호");
		units[4] = new Navy("해군1호");

		for (int i = 0; i < units.length; i++) {
			units[i].attack();
			
			if(units[i] instanceof Army) {
				Army a = (Army) units[i];
				a.tank();
			}else if(units[i] instanceof Navy) {
				Navy n = (Navy) units[i];
				n.AircraftCarrier();
			}else {
				AirForce f = (AirForce) units[i];
				f.FighterPlane();
			}

		}
	}

}
