package ClassBuilderPattern;

public class AmazonApp {

	public AmazonApp doLogin() {
		System.out.println("login to app");
		return this;
	}

	public AmazonApp doLogin(String un, String pwd) {
		System.out.println("login to app : " + un + " " + pwd);
		return this;      // return this means method will return object of current class
	}

	public AmazonApp doSearch(String productName) {
		System.out.println("search product: " + productName);
		return this;
	}

	public AmazonApp doSearch(String productName, int price) {
		System.out.println("search product: " + productName + ":" + price);
		return this;

	}

	public AmazonApp doSearch(String productName, int price, String seller) {
		System.out.println("search product: " + productName + ":" + price + " : " + seller);
		return this;
	}

	public AmazonApp addToCart(String productName) {
		System.out.println("add to cart : " + productName);
		return this;
	}

	public AmazonApp makePayment(String cc, int cvv) {
		System.out.println("making payment : " + cc + ":" + cvv);
		return this;
	}

	public AmazonApp makePayment(String upi) {
		System.out.println("making payment : " + upi);
		return this;
	}

	public AmazonApp generateOrderID() {
		System.out.println("your order id is : " + 123456);
		return this;
	}

	public AmazonApp logout() {
		System.out.println("logout....");
		return this;
	}
	
	
}
