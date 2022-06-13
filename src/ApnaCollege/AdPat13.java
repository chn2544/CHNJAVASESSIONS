package ApnaCollege;

import java.util.Scanner;

public class AdPat13 {

	public static void main(String[] args) {
		
//		             1
//		           2 1 2
//		         3 2 1 2 3
//		       4 3 2 1 2 3 4
//		     5 4 3 2 1 2 3 4 5
//		       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		int var=0;
		
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<(n-i);j++)
			{
				System.out.print(" ");
			}
			
			//First Half Numbers
			
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j);
				
			}
			//Second Half Numbers

			for (int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
	}

}
