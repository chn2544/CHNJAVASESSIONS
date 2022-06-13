package MyEncapsulation;

import java.util.ArrayList;

public class CallingClass {

	public static void main(String[] args) {

		HiddenClass hc=new HiddenClass();
		
		hc.setAge(28);
		hc.setName("Chinmay");
		hc.setRollno(12);
		System.out.println("\n---------Welcome-----------\n");
		System.out.println("Name - "+hc.getName()+"| Age - "+hc.getAge()+"| Roll No - "+hc.getRollno() );
		System.out.println("\n---------Thank You-----------\n");
		
		HiddenClass2 hc2=new HiddenClass2();
		
		String city=hc2.city="Baroda";
		hc2.setgender('M');
		hc2.setsalary(36267);
		ArrayList<String> al=new ArrayList<String>();
		al.add("Cricket");
		al.add("Singing");
		al.add("Swimming");
		hc2.setAL(al);
		
		System.out.println("\nCity of Employee : "+city + "\nGender of Employee : "+hc2.getgender()+"\nSalary of Employee : "+hc2.getsalary()+"\nList of Interests : "+hc2.getAl());
		System.out.println("\n---------Thank You-----------\n");
		
	}

}
