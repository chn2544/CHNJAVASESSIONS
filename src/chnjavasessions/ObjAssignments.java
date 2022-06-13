package chnjavasessions;

public class ObjAssignments {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
			

		// o1= o2
		// o2= o3
		// o3 =o4
		// o4 =o1

		ObjAssignments o1 = new ObjAssignments();
		o1.name = "Garima";
		o1.age = 25;
		o1.city = "Pune";

		ObjAssignments o2 = new ObjAssignments();
		o2.name = "Swapna";
		o2.age = 30;
		o2.city = "Bangalore";

		ObjAssignments o3 = new ObjAssignments();
		o3.name = "Prashant";
		o3.age = 26;
		o3.city = "LA";

		ObjAssignments o4 = new ObjAssignments();

		System.out.println(o1.name + " " + o1.age + " " + o1.city);
		System.out.println(o2.name + " " + o2.age + " " + o2.city);
		System.out.println(o3.name + " " + o3.age + " " + o3.city);

		o2 = o1;

		System.out.println(o1.name + " " + o1.age + " " + o1.city);
		System.out.println(o2.name + " " + o2.age + " " + o2.city);
		System.out.println(o3.name + " " + o3.age + " " + o3.city);
//
		o1 = o3;

		System.out.println(o1.name + " " + o1.age + " " + o1.city);
		System.out.println(o2.name + " " + o2.age + " " + o2.city);
		System.out.println(o3.name + " " + o3.age + " " + o3.city);

		o3 = o2;    // Here o3 is pointing to o2 but o2 is alreay pointing to o1 so o3 will point to o1
		System.out.println(o1.name + " " + o1.age + " " + o1.city);
		System.out.println(o2.name + " " + o2.age + " " + o2.city);
		System.out.println(o3.name + " " + o3.age + " " + o3.city);

		o1 = o4;
		System.out.println(o1.name + " " + o1.age + " " + o1.city);
		System.out.println(o2.name + " " + o2.age + " " + o2.city);
		System.out.println(o3.name + " " + o3.age + " " + o3.city);
		System.out.println(o4.name + " " + o4.age + " " + o4.city);


	}

}
