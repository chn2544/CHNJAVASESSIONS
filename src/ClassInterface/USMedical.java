package ClassInterface;

public interface USMedical extends WHO {
	
	int min_fee = 10;
	//vars are final and static in nature by default

	// can not have method body
	// only method declration: method prototype
	// abstract method: has no method body
	// can not create the object of Interface
	//abstract method can not be static method

	public void physioServices();
	public String physioServices(int a);

	public void cardioServices();

	public void ENTServices();
	
	public void emergencyServices();
	
	//after jdk 1.8: two major changes:
	
	//1. can have static method with method body in Interface:
	public static void billing() {
		System.out.println("US -- billing");
	}
	
	//2. can have one non static default method with method body
	default void medialHistory() {
		System.out.println("US -- medialHistory");
	}
	
	



}
