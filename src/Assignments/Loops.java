package Assignments;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////////////////////////////////////////////////////
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello Batman Here");
		}
		
		////////////////////////////////////////////////////
		System.out.println("\n---------------------------------\n");
		int j=1;
		do
		{
			System.out.println("Hello Batman Number :"+j);
			j++;
		}
		while(j<=9);
		
		////////////////////////////////////////////////////
		System.out.println("\n---------------------------------\n");
		int k=1;
		while (k<=10)
		{
			System.out.println("Hello World");
			k++;
		}

		////////////////////////////////////////////////////
		//Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
		System.out.println("\n---------------------------------\n");
		int x=1;
		do
		{
			System.out.println("Print Number "+x);
			x++;
		}
		while (x%7!=0);
		System.out.println("Number Divisible by 7 is encountered : "+x);
		
	}

}
