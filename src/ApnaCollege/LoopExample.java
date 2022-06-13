package ApnaCollege;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print Sum of N Natural Numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sum of how many natural numbers you want : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of First "+n+" numbers is :"+sum);
		
		// Print table of Number
		System.out.println("Enter number for which you want to print table of: ");
		int num=sc.nextInt();
		int i=1;
		System.out.println("Printing Table of - "+num);
		do
		{
			System.out.println(num+ " X "+i+" = "+(num*i));
			i++;
		}
		while(i<=10);
	}

}
