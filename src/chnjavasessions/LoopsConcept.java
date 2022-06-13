package chnjavasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 to 10:
				//1. while loop:
				
				int i = 1;
				while(i<=10) {
					System.out.println(i);//12345678910
					i++;
					//i = i+1;
					//++i;
				}
				
				boolean flag = false;
				int i1 = 11;
				while(i1<=100 && i1>=10) {
					System.out.println(i1);
					i1++;
				}
				
				//infinite loop:
//				while(true) {
//					System.out.println("Welcome to Hotel Taj !!");
//				}
//				
				//even numbers 1 to 100:
				System.out.println("------");
				int k = 1;
				while(k<=100) {
					//System.out.println(k);
						if(k % 2 == 0) {
							System.out.println(k);
							//break;
						}
					k++;	
				}
				System.out.println("------");
				
				//use cases:
				//number of interations are not fixed
				//pagination
				//calendar
				//carousel
				//lazy loading scrolling
				//WebElement wait logic
				

				//2. for loop:
				//1 to 10:
				for(int j=1; j<=10; j++) {
					System.out.println(j);//1234..10
				}
				//10 to 1:
				
				System.out.println("------");

//				for(;;) {
//					System.out.println("Bye!!");
//				}
				
				System.out.println("------");
				for(byte b = 1; b<=5; b++) {
					System.out.println(b);
				}
				
				System.out.println("------");
				for(double d = 1.0; d<=10.0; d++) {
					System.out.println(d);
				}
				
				System.out.println("------");
				for(char c = 'A'; c<='Z'; c++) {
					System.out.println(c+ " : "+ (int)c);
				}
				
				System.out.println("------");
				//use cases:
				//number of interations are fixed
				//array/arraylist
				//drop downs -- month, year
				//20 elements -- text
				//window handling --> while, for
				//web elements 

				//3. do-while loop: 1 to 10:
				
				int p = 1;
				do {
					System.out.println(p);//1
					//p++;
				} 
				while (false);
				
				//use cases:
				//waiting for the element to be apprered on the page
	}

}
