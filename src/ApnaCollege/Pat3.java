package ApnaCollege;

import java.util.Scanner;

public class Pat3 {

	public static void main(String[] args) {
		
//        *
//        **
//        ***
//        ****
//        *****
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows :" );
		int i=sc.nextInt();
		
		
		for(int a=0;a<=i;a++)
		{
			for(int b=0;b<a;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
