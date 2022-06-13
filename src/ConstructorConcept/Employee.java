package ConstructorConcept;

public class Employee {


	// class vars
	String name;
	int age;
	String city;
	boolean isActive;

//	public Employee() {
//		System.out.println("this is default const....");
//	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, boolean isActive) {
		this.name = name;
		this.age = age;
		this.isActive = isActive;
	}

	public Employee(String name, int age, String city, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.isActive = isActive;
	}
	
	
	
	
	// constructor:
	// is not a function
	// can not return anything
	// no return type
	// no void
	// const.. name wil be same as the class name
	// const... can be overloaded
	// const.. will be called when you create the object of the class
	//const.. is used to initialize the class vars with the const... local variable using this keyword
	//const... is used to restrict the unnecessary object creation
	//never write buss logic/ feature logic inside the const....
	//business logic should be written inside the function

//	public Employee() {// 0 param
//		System.out.println("default const...");
//	}
//
//	public Employee(int a) {// 1 param
//		System.out.println("1 param const..." + a);
//	}
//
//	public Employee(int a, int b) {// 2 params
//		System.out.println("2 params const..." + (a + b));
//	}
}
