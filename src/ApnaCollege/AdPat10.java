package ApnaCollege;

import java.util.Scanner;

public class AdPat10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*      *
//		**    **
//		***  *** 
//		********
//		********
//		***  ***
//		**    **
//		*      *
//		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		
		//int n=5;

		// Upper Half
		
		for(int i=1;i<=n;i++)
		{
			//left side part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			//spaces			
			int spaces = 2*(n-i);
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			
			//right side part
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		// Lower Half
		
				for(int i=n;i>=1;i--)
				{
					//left side part
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					
					//spaces			
					int spaces = 2*(n-i);
					for(int j=1;j<=spaces;j++)
					{
						System.out.print(" ");
					}
					
					//right side part
					for(int j=1;j<=i;j++)
					{
						System.out.print("*");
					}
					
					System.out.println();
				}
	}

}
