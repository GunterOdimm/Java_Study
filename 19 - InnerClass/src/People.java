
public class People {
	public class Man {

		public String name;
		public int age;
		public boolean military;

		public Man(String name, int age, boolean military) {
			this.name = name;
			this.age = age;
			this.military = military;
		}

		@Override
		public String toString() {
			return "남성 [이름=" + name + ", 나이=" + age + ", 병역=" + military + "]";
		}

	}

	public static class Woman {
		public String name;
		public int age;

		public Woman(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "여성 [이름=" + name + ", 나이=" + age + "]";
		}

	}

}
