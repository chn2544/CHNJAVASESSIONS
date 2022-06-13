package ApnaCollege;

import java.util.Scanner;

public class AdPat14 {

	public static void main(String[] args) {
		
//		        *
//		       * *
//		      * * *
//		     * * * *
//		    * * * * *
//		     * * * *
//		      * * *
//		       * *
//		        *
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		
		
//		//First Half
//		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

//		//Second Half
		for (int i=n;i>=1;i--)
		{
			for (int j=1;j<=(n-i);j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
