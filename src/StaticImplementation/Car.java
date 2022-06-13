package StaticImplementation;

public class Car {

	String name;
	int price;
	String color;
	static final int wheels = 4;

	public static void main(String[] args) {
		
		final int i = 10;//local var can be declared as final
		 //i = 20;
	//	static int b=46; // local var cannot be declared as static
		
		final int days = 7;
		//days = 10;
		System.out.println(100 * days);
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Black";
		
		System.out.println(c1.wheels);//warning
		//how to call static vars:
		//1. using class name:
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + Car.wheels);
		//System.out.println(Car.wheels);
		 // System.out.println(Car.name); // cannot access non static with class name
		//2. directly calling:
		System.out.println(wheels);
		
		//Car.wheels = 5;

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 40;
		c2.color = "Red";
		

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "White";
	}
	}
