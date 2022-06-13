package ApnaCollege;

import java.util.Scanner;

public class Pat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			1
//			12
//			123
//			1234
//			123456
//			
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int n=sc.nextInt();
		
		
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			
			}
			System.out.println();
		}
		
	}

}
