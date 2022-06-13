package Assignments;

import java.util.Scanner;

public class Programiz {

	public static void main(String[] args) {
	
		//----- Program to Take a Number from User and Print it ---------// 
//		
//	//An object of Scanner class, reader  is created to take inputs from standard input, which is keyboard.
//		 Scanner reader = new Scanner(System.in);
//	     System.out.print("Enter a number: ");
//	// reader.nextInt()then reads all entered integers from the keyboard unless it encounters a new line character \n (Enter)
//	     int number = reader.nextInt();
//	// println() prints the following line to the output screen
//	     System.out.println("You entered: " + number);
	     
	   //----- Program to Multiply 2 Float Numbers ---------//
	     System.out.println("----------------------------");
     // Notice, we have used f after the numbers. This ensures the numbers are float, otherwise they will be assigned - type double.
	     float f1=4.56f;
	     float f2=3.12f;
	     System.out.println("Product of f1Xf2 is :"+(f1*f2));
	     
	  //----- Program to Find ASCII of Char ---------//
	     System.out.println("----------------------------");
	     char a='T';
	    //We can cast the character a to an integer using (int).
	    //In simple terms, casting is converting variable from one type to another, here char variable ch is converted to an int variable.
	     System.out.println("ASCII Value of "+a+" is : "+(int)a);
	 
	  //----- Program to Find Quotient and Reminder  ---------//
	     System.out.println("----------------------------");
	     int a1=45;
	     int b1=5;
	     System.out.println("Quotient of 45/5 is :"+(a1/b1));
	     System.out.println("Reminder of 45/5 is :"+(a1%b1));
	     
	   //----- Program to Swap two Numbers  ---------//
	     System.out.println("----------------------------");
	     int first=45,second=56;
	     int third;
	     System.out.println("Before Swapping Numbers are\n First : "+first+"\n Second : "+second);
	     third=first;
	     first=second;
	     second=third;
	     System.out.println("After Swapping Numbers are\n First : "+first+"\n Second : "+second);
	     
	   //----- Program to Check Even/Odd  ---------//
	     System.out.println("----------------------------");
	     int x1=53,x2=66;
	     if(x1%2==0)
	     {
	    	 System.out.println(x1+" is even number");
	     }
	     else
	    	 System.out.println(x1+" is odd number");
	     if(x2%2==0)
	     {
	    	 System.out.println(x2+" is even number");
	     }
	     else
	    	 System.out.println(x2+" is odd number");
	     
	     //----- Program to Alphabet is vowel of constant  ---------//
	     System.out.println("----------------------------");
	     char p1='q',p2='u';
	     if (p1=='a'||p1=='e'||p1=='i'||p1=='o'||p1=='u')
	     {
	    	 System.out.println(p1+" is a vowel");
	     }
	     else
	    	 System.out.println(p1+" is a constant");
	     
	   //----- Program to Check Leap Year   ---------//
	     System.out.println("----------------------------");
	     //A leap year is exactly divisible by 4 except for century years (years ending with 00). 
	     //The century year is a leap year only if it is perfectly divisible by 400.
	     int year = 2100;
	     boolean leap = false;
	     // if the year is divided by 4
	     if (year % 4 == 0) {
	       // if the year is century
	       if (year % 100 == 0) {
	         // if year is divided by 400
	         // then it is a leap year
	         if (year % 400 == 0)
	           leap = true;
	         else
	           leap = false;
	       }	       
	       // if the year is not century
	       else
	         leap = true;
	     }
	       else
	       leap = false;
	     if (leap)
	       System.out.println(year + " is a leap year.");
	     else
	       System.out.println(year + " is not a leap year.");
	     
	     
	}

}
