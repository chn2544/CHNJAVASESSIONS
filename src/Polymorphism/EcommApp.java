package Polymorphism;

public class EcommApp {

	// method overloading: poly(many)+morphism(forms) --> compile Time(static, early
	// binding)
	// within the same class you have different methods:
	// 1. with the same name
	// 2. with different parameters
	// 3. with different sequence of the paramters

	public int test() {// 0 param
		System.out.println("test method....");
		return 10;
	}
	

	public String test(int a) {// 1 param
		System.out.println("test method...." + a);
		return "naveen";
	}

	public void test(int a, int b) {// 2 params
		System.out.println("test method...." + a + b);
	}

	public void test(String a, int b) {// 2 params
		System.out.println("test method...." + a + b);
	}

	public void test(int a, String b) {// 2 params
		System.out.println("test method...." + a + " "+b);
	}

	
	// amazon: login
	public void doLogin() {

	}

	public String doLogin(String un, String pwd) {

		return un+" "+pwd;
	}

	public void doLogin(String un, String pwd, String role) {

	}

	public void doLogin(String un, String pwd, String ph, int otp) {

	}

	// search():
	public void doSearch() {

	}

	public void doSearch(String productName) {

	}

	public void doSearch(String productName, String brandName) {

	}

	public void doSearch(String productName, String brandName, int price) {

	}

	public void doSearch(String productName, String brandName, int price, String color) {

	}

	// payment:
	public void makePayment(String cc, int cvv) {
		//10
	}

	public void makePayment(String cc, int cvv, int otp) {
		//100
	}

	public void makePayment(String cc, String pwd) {

	}

	public void makePayment(String upi) {

	}

	// uber:
	public void booking(String stPoint, String endPoint) {

	}

	public void booking(String stPoint, String endPoint, String carType) {

	}
	
	public void booking(String stPoint, String endPoint, String carType, int passengers) {

	}
	
	public void booking(String stPoint, String endPoint, String paymentType, String couponCode) {

	}

	public static void main(String[] args) {
		EcommApp obj = new EcommApp();
		obj.test(10); //call by value/pass by value
		obj.test(100, "naveen");
		String str=obj.doLogin("admin", "admin");
		System.out.println(str);
	}

}