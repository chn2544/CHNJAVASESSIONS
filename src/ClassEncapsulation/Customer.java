package ClassEncapsulation;

public class Customer {
	// POJO: Plain Old Java Object

		// POM: Page Classes : Encapsulation 
		// While creating Page Classes, we use encapsulation 

		private String name;
		private int age;
		private boolean isActive;
		
		
		// This is also encapsulation , setting values via constructor 
		// This constructor is behaving like setter... 
		public Customer(String name, int age, boolean isActive) {
			this.name = name;
			this.age = age;
			this.isActive = isActive;
		}

		// public getter/setter:
		public String getName() {
			return name;
		}

		// Question is if constructor is setting values, why setter is required ?
		// Answer - If user wants to update the data, setter is required 
		
		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
}
