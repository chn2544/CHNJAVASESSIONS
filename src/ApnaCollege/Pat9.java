package ApnaCollege;

import java.util.Scanner;

public class Pat9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		1 0 1 0 1
//		0 1 0 1 0 1

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		
		
		for (int i=0;i<=n;i++)
		{
			for (int j=0;j<=i;j++)
			{   
				if((i+j)%2==0)
				{
				System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			
			System.out.println();
		}
	}

}
