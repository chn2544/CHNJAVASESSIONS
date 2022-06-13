package ApnaCollege;

import java.util.Scanner;

public class Pat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		               *
//		              **
//		             ***
//		            ****
//		           *****
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int i=sc.nextInt();
		
		for(int a=1;a<=i;a++)
		{
			for(int j=1; j<=i-a;j++ )
			{
				System.out.print(" ");
			
				
			}
			for(int j=1; j<=a;j++)
			{
			System.out.print("*");
			}

			System.out.println();
		}

	}

}
