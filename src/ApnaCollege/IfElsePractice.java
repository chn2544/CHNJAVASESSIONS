package ApnaCollege;

import java.util.Scanner;

public class IfElsePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check if even or odd :");
		int test=sc.nextInt();
		
		if(test%2==0)
		{
			System.out.println(test+" is a even number");
		}
		else
		{
			System.out.println(test+" is a odd number");
		}
		
		System.out.println("Hey User, Please enter number 1 :");
		int num1=sc.nextInt();
		System.out.println("Hey User, Please enter number 2 :");
		int num2=sc.nextInt();
		
		if(num1==num2)
		{
			System.out.println(num1+" and "+num2+" are same");
		}
		else if(num1>num2)
		{
			System.out.println(num1+" is greater than "+num2);
		}
		else
		{
			System.out.println(num1+" is lesser than "+num2);
		}
	}

}
