package ApnaCollege;

import java.util.Scanner;


public class FunctionCheck {

	public int checkNum(int p)
	{
		System.out.println("I got number "+p+" form Main Method");
		System.out.println("Return it back to Main Method with adding 100 in it");
		return 100+p;
	}
	
	public int sum(int a,int b)
	{
		System.out.println("Adding "+a+ " and "+b);
		int total=a+b;
		return total;
	}
	
	public int multiply(int a,int b)
	{
		System.out.println("Multiplying "+a+ " and "+b);
		int total=a*b;
		return total;
	}
	
	public int factorial(int a)
	{
		int fact=1;
		
		if(a==0||a==1)
		{
			return 1;
		}
		else
		{
			do
			{
				fact=fact*a;
				a--;
			}
			while(a>=1);
			
		  return fact;	
		}
		
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionCheck fc=new FunctionCheck();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to pass to function :");
		int num=sc.nextInt();
		int main=fc.checkNum(num);
		System.out.println("--------------------------");
		System.out.println("This is final output : "+main);
		System.out.println("\n--------------Addition Programme------------");
		System.out.println("Enter Number 1 :");
		int n1=sc.nextInt();
		System.out.println("Enter Number 2 :");
		int n2=sc.nextInt();
		int total=fc.sum(n1, n2);
		System.out.println("--------------------------");
		System.out.println("Result of addition of "+n1+" and "+n2+" is :"+total);
		System.out.println("\n--------------Multiplication Programme------------");
		System.out.println("Enter Number 1 :");
		int n3=sc.nextInt();
		System.out.println("Enter Number 2 :");
		int n4=sc.nextInt();
		int total2=fc.multiply(n3, n4);
		System.out.println("--------------------------");
		System.out.println("Result of Multiplication of "+n3+" and "+n4+" is :"+total2);
		System.out.println("\n--------------Factorial Programme------------");
		System.out.println("Enter Number for Factorial  :");
		int n5=sc.nextInt();
		int result=fc.factorial(n5);
		System.out.println("Result of "+n5+"! is :"+result);
		
		
	}

}
