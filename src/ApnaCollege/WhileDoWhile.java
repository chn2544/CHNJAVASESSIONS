package ApnaCollege;

public class WhileDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;
		
		while(i<8)        // Condition is false, hence wont print anything
		{
			System.out.println("While Loop Printing i :"+i);
		}
		
		do 
		{
			System.out.println("Do While Loop Printing i :"+i);
		}
		while(i<8);   // Condition is false , but it will print once becaus of Do.
	}

}
