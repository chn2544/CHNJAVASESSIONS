package AccessModifiers;

public class BMW extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
		b.color="Blue";
		b.name="X45";
		b.plateNumber=345;
//		b.price;        // this cannot be accessed as its private  Same Package Subclass

	}

}
