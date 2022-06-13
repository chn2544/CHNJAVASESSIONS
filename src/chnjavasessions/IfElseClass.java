package chnjavasessions;

public class IfElseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 11;
		int b = 10;
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(a>=10) {
			System.out.println("this is gr than eq to 10");
		}
		
		if(false) {//dead code
			System.out.println("Hi...");
		}
		else {
			System.out.println("Bye..");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("Hello Selenium");
		}
		else {
			System.out.println("Bye Selenium");
		}
		
		//nested if
		int marks = 99;
		if(marks<=100) {
			System.out.println("Hi student...");
				if(marks >=90) {
					System.out.println("Grade A");
						if(marks >=95) {
							System.out.println("GRADE A++");
						}
				}
				else if(marks>=70) {
					System.out.println("Grade B");
				}
				else if(marks>=40) {
					System.out.println("Grade C");
				}
		}
		else {
			System.out.println("Wrong marks...");
		}
		
		//if - else if
		int number = 25;
		if(number <=10) {
			System.out.println("hi");
		}
		else if(number <=20) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
		
		
		String name = "Peter";
		if(name.equals("Tom")) {
			System.out.println("10 marks");
		}
		else if(name.equals("Vaibhav")) {
			System.out.println("20 marks");
		}
		else if(name.equals("Ravi")) {
			System.out.println("30 marks");
		}
		else if(name.equals("Peter")) {
			System.out.println("40 marks");
		}
		else {
			System.out.println("student is not found....");
		}
		
		
		
		//
		//find out the greatest number....all the numbers are different
		int x = 400;
		int y = 600;
		int z = 200;
		
		if(x>y && x>z) {//false && true = false
			System.out.println("x is the greatest");
		}
		else if(y>z) {//false
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
	}

}
