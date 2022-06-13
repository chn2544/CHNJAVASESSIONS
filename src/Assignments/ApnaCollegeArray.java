package Assignments;

import java.util.Scanner;

public class ApnaCollegeArray {

	public static void main(String[] args) {
		
		// Take an array as a input from user .
		// Search for a given number x and print index where it occurs
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Size of Array : ");
		boolean flag=false;
		int size=sc.nextInt();
		int input[]=new int[size];
		
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter Element for Index "+i+" : " );
			input[i]=sc.nextInt();
		}
		
		System.out.print("Enter Number to be checked in array :");
		int num=sc.nextInt();
		
		for (int j=0;j<input.length;j++)
		{
			if(num==input[j])
			{
			System.out.println(" "+num+" is present at index "+j);
			flag=true;
			break;
			}
					
		}
		if(flag==false)
		{
			System.out.println(" "+num+" is not present in Array");
		}
		
				
				
		

	}

	}
