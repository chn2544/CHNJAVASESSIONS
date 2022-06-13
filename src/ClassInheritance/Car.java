package ClassInheritance;

public class Car extends Vehicle {
	

	public void start() {
		System.out.println("Car -- start");
	}

	public void stop() {
		System.out.println("Car -- stop");
	}

	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void getPrice() {
		System.out.println("car -- get price");
	}
	
	private void info() {
		System.out.println("Car -- info");
	}
	
	public final void billing() {
		System.out.println("Car -- billing");
	}

}
