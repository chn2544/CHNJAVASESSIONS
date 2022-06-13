package Assignments;

public class ObjAssPrac {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		ObjAssPrac u1=new ObjAssPrac();
		u1.name="Chinmay";
		u1.age=25;
		u1.city="Nashik";
				
		ObjAssPrac u2=new ObjAssPrac();
		u2.name="Dhanu";
		u2.age=28;
		u2.city="PB";
		
		ObjAssPrac u3=new ObjAssPrac();
		u3.name="John";
		u3.age=45;
		u3.city="Mumbai";
		
		ObjAssPrac u4=new ObjAssPrac();
		u4.name="Sam";
		u4.age=15;
		u4.city="Pune";

	    System.out.println("---------------- Normal Printing--------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		u1=u2;
		
		System.out.println("---------------- u1=u2--------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		u2=u3;
		
		System.out.println("---------------- u2=u3--------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		u3=u4;
		
		System.out.println("---------------- u3=u4--------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		u4=u1;
		
		System.out.println("---------------- u4=u1--------------");
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);   // values of u2 will be printed because u1 is already pointing to u2
		

	    System.out.print("---------------- Thank You--------------");
		
	}

}
