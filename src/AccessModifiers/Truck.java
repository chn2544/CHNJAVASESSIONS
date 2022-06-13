package AccessModifiers;

public class Truck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Car c = new Car();
		
		c.color="Yellow";
		c.name="AUdi";
		c.plateNumber=5637;
		// c.price is not visible because its private
		
		
		Truck t = new Truck();
		// we cannot access anything from truck as truck and car has no relationship

	}

}
