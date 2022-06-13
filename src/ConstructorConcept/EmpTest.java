package ConstructorConcept;
import java.util.ArrayList;
import java.util.Arrays;


public class EmpTest {

	public static void main(String[] args) {

		Employee e = new Employee("Naveen");
	
		System.out.println(e.name);
		
		
		
		Employee e1 = new Employee("Tom", 30);
		System.out.println(e1.name + " " + e1.age + " " + e1.isActive + " " + e1.city);
		
		Employee e2 = new Employee("Peter", 40, false);
		
		Employee e3 = new Employee("Lisa", 45, "Pune", true);

		
		//Employee e4 = new Employee();
		
		/////
		

		
		
		LoginPage lp = new LoginPage("admin@gmail.com", "admin@123");
		lp.doLogin();
		
		LoginPage lp1 = new LoginPage("seller@gmail.com", "seller@123");
		lp1.doLogin();
		
		//
		Customer c1 = new Customer("Naveen", 100);
		System.out.println(c1.name + " " + c1.id + " " + c1.phone + " " + c1.cardsList);
		
		ArrayList<String> shiftCCList = new ArrayList<String>();
		shiftCCList.add("HDFC CC 12121212");
		shiftCCList.add("ICICI DC 89898989");
		shiftCCList.add("SBI CC 9898989");

		Customer c2 = new Customer("Shifa", 200, "01-01-1990", "9898989890", "Bangalore", true, shiftCCList);

		System.out.println(c2.name + " " + c2.id + " " +c2.cardsList);
		
		
		//
		Student s1 = new Student("Saurabh");
		Student s2 = new Student("Swapna", 101);
		System.out.println(s2.name + " " + Arrays.toString(s2.subject));

		
		String sub[] = {"Physics", "chem", "Maths", "English", "Eng Engg"};
		Student s3 = new Student("Arzoo", 102, sub);

		System.out.println(s3.name + " " + Arrays.toString(s3.subject));
		
		
		//
		//Users u1 = new Users();
				
		
	}

}
