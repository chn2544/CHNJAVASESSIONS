package AccessModPackage;

import AccessModifiers.Car;

public class BMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.name="C456";
//		c.color  // not accisible as its protected and this is non subclass of diff package
//		c.price // not accissible as its private
//		c.platenumber //  not accessible as its default and we are in diff package
	}

}
