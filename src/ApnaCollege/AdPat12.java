package ApnaCollege;

import java.util.Scanner;

public class AdPat12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//					1
//				   2 2
//				  3 3 3
//				 4 4 4 4
//				5 5 5 5 5
		
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		
		
		for (int i=0;i<=n;i++)
		{
			for (int j=0;j<(n-i);j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}
