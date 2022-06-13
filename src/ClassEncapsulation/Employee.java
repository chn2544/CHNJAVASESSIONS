package ClassEncapsulation;

public class Employee {
	private String name;
	private int age;
	private String city;

	// public methods:
	// getter and setter: public

	public String getEmpData() {
		return name + " " + age + " " + city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
