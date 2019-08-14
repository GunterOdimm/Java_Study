package Stduy.java.model;

public class people {
	private String name;
	private String phoneNB;

	public people(String name, String phoneNB) {
		super();
		this.name = name;
		this.phoneNB = phoneNB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNB() {
		return phoneNB;
	}

	public void setPhoneNB(String phoneNB) {
		this.phoneNB = phoneNB;
	}

	@Override
	public String toString() {
		return "people [name=" + name + ", phoneNB=" + phoneNB + "]";
	}

}
