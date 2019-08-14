package classCall;
class Member {
	String name;
	int age;

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return this.age;
	}

	void setAge(int age) {
		this.age = age;
	}

	void say() {
		System.out.println(this.getName());
		System.out.println(this.getAge());
	}
}
