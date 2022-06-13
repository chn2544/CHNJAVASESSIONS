package ExceptionHandlingPkg;

public class ExceptionHandling {

	String name;
	
	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {
			int i = 9 / 0;
			ExceptionHandling obj = new ExceptionHandling();
			obj = null;
			obj.name = "Naveen";

			System.out.println("Hi");
			System.out.println("Hi");

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic excetpion is coming...");
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			System.out.println("Null Pointer excetpion is coming...");
			e.printStackTrace();
		}

		catch (Error e) {

		}

		System.out.println("Bye");
		System.out.println("Bye");

	}

}




