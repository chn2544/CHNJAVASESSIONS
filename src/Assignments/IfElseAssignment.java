package Assignments;

public class IfElseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1=140,number2=970,number3=8180,number4=600;
		
		 if(number1 > number2)
	      {
	         if(number1 > number3)
	         {
	            if(number1 > number4)
	            {  
	               System.out.println("Largest of four numbers is: " + number1);
	            }
	            else
	            {
	               System.out.println("Largest of four numbers is: " + number4);
	            }
	         }
	      }
	      else if(number2 > number3)
	      {
	         if(number2 > number4)
	         {
	            System.out.println("Largest of four numbers is: " + number2);
	         }
	         else
	         {
	            System.out.println("Largest of four numbers is: " + number4);
	         }
	      }
	      else if(number3 > number4)
	      {
	         System.out.println("Largest of four numbers is: " + number3);
	      }
	      else
	      {
	         System.out.println("Largest of four numbers is: " + number4);
	      }
		
		
		
		
	}

}
