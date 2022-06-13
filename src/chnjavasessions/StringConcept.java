package chnjavasessions;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		System.out.println(s);
		
		String s1 = "hi this is my java code and im so happy";
		System.out.println(s1);
		
		System.out.println(s+s1); // This is concatenation of strings
		
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "Selenium";
		System.out.println(a+b);  // numeric calculation
		System.out.println(x+y);  // string concatenation
		System.out.println(a+b+x+y);   // Numeric and then concatenation 
		System.out.println(x+y+a+b);  // Only concatenation as seq of operation is from left to right and string is mentioned first
		System.out.println(x+y+(a+b));   // concatenation with numeric result
		System.out.println(a+b+x+y+a+b);  // numeric then concatenation with string and its concatenation with numbers again
		System.out.println(a+b+x+y+(a+b)); // numeric then concatenation with string and its concatenation with numeric result in bracket
		System.out.println("the value of a is: " + a); 
		System.out.println("the value of b is: " + b);
		System.out.println("the sum is : " + (a+b));
		
		double c = 12.33;
		double d = 12.44;
		System.out.println(x+y+c+d);        
		System.out.println(a+b+c+d+x+y);
		System.out.println(c+d+x+y+a+b);
		System.out.println(a+""+b+x+y);  // Concatenation of Numbers and String
		
		char p = 'a';
		char q = 'b';
		System.out.println(x+y+p+q);     // Concatenation of String + char values
		System.out.println(p+q+x+y);  // First Chars ASCII Values will be added and then string will be concatenated to it.
		
		char g = 'a';
		String h = "a";
		System.out.println(g+h); // As there is one of the string, char is concatenated with string
		
		System.out.println("hi naveen here");
		System.out.println(1000+20);
		System.out.println((int)'a');  // ASCII
		System.out.println("1000"+20);  // Concatenation 
		
		//
		System.out.println(9/3);   // Direct Division 
		System.out.println(9/2);//4         Quotient
		System.out.println(9/2.0);//4.5      If at lease one is decimal, will get decimal value in answer if it comes
		System.out.println(9.0/2);//4.5          If at lease one is decimal, will get decimal value in answer if it comes
		System.out.println(9.0/2.0);        //  If at lease one is decimal, will get decimal value in answer if it comes
		//System.out.println(9/0);//AE     // Divide by 0 Exception
		System.out.println(0/9);           // 0 Div by any natural Number  will give 0
		System.out.println(9.0/0);//Infinity      // decimal div by 0 will give infinity
		System.out.println(9.0/0.0);//Infinity  // decimal div by 0 will give infinity
		//System.out.println(0/0);//AE            // Divide by 0 Exception
		System.out.println(0.0/0.0);//NaN          // 0.0 will give Not a Number
		System.out.println(0.0/0);//NaN                 // 0.0 will give Not a Number
		System.out.println(0/0.0);//NaN            // 0.0 will give Not a Number
		
		System.out.println(8 % 2);        //  Reminder - 0
		System.out.println(9 % 2);       // Reminder - 1
	}

}
