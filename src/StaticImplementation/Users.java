package StaticImplementation;


public class Users {

	String name;
	static int age;

	public void getMail() {
		System.out.println("get mail method....");
	}

	public static void sendMail() {
		System.out.println("send mail method....");
	}

	public static void main(String a[]) {

		Users.main(a);
//		System.out.println(a.length);// 0
//		System.out.println(a[0]);// IOB

		Users u1 = new Users();
		// 1. how to call non static methods and vars: need to create the object

		Users obj = new Users();
		obj.name = "Tom";
		obj.getMail();

		obj.age = 20;
		obj.sendMail();
		
		//2. direct calling:
		age = 30;
		System.out.println(age);
		sendMail();
		
		// 3. how to call static methods and vars: no need to create the object
		// a. by using className
		Users.age = 20;
		Users.sendMail();

	}

}

