package ApnaCollege;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number between 1 to 5 :");
		int test=sc.nextInt();
		
		switch(test)
		{ 
		case  1 : System.out.println("A+ Grade"); 
				  break;
		case  2 : System.out.println("A  Grade"); 
		 		  break;
		case  3 : System.out.println("B+ Grade"); 
				  break;
		case  4 : System.out.println("B Grade"); 
		          break; 
		case  5 : System.out.println("C Grade"); 
				  break;
		default: System.out.println("Invalid Input");
		}
		
	
	}

}
