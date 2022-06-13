package ExceptionHandlingPkg;

public class FinallyBlock {

	public static int getMarks(String name) {
		System.out.println("getting marks for : " + name);

		if (name.equals("Jaya")) {
			try {
				int i = 9 / 3;
		//		System.exit(1);  to stop JVM Execution
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("some exception is coming...");
				return 91;
			}
			finally {
				System.out.println("inside finally block");
				return 92;
			}
			
		} 
		else if (name.equals("Tom")) {
			return 95;
		} 
		else if (name.equals("Naveen")) {
			return 80;
		} else {
			System.out.println("stundent is not found....");
			return -1;
		}

	}

	public static void main(String[] args) {
		int score = getMarks("Jaya");
		System.out.println(score);

//		System.out.println("A");
//
//		try {
//			int i = 9 / 3;
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//
//		}
//
//		finally {
//			System.out.println("this is finally block.....");
//		}
		
		//DB Close :
		//make sql db connection
		// hit sql 
		//send sql to server
		//get result from db server
		//use data
		
		// finally {
		// close db connection    // using this in finally so as to compulsarily close connection else load will keep on increasing
		// } 
	}

}
