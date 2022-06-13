package AccessModPackage;

import AccessModifiers.Car;

public class Audi extends Car {

	public static void main(String[] args) {
		// 
		Audi a=new Audi();
		a.color="Blue";
		a.name="X45";
//		a.price   // not accisible as its private
//		a.platenumber    // not accessible as its default and we are in diff package
			
	}

}
