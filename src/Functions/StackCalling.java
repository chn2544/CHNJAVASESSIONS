package Functions;

public class StackCalling {

	public void m1()
	{     System.out.println("I am m1");
		  m2();
	}
	
	public void m2()
	{
		System.out.println("I am m2");
		m3();
	}
	
	public void m3()
	{
		System.out.println("I am m3");
//		m1();         writing this line with give stackoverflow exception
	}
	
	public static void main(String[] args) {
	
		StackCalling sc=new StackCalling();
		sc.m1();
				
	}

}
