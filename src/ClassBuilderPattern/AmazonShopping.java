package ClassBuilderPattern;

public class AmazonShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonApp obj = new AmazonApp();
		obj.doLogin("naveen@gmail.com", "naveen@123")
			.doSearch("Macbook Pro")
				.addToCart("Macbook Pro")
					.makePayment("1212 1212 1212 1212", 989)
						.generateOrderID()
							.logout();
		
		//
		obj.doLogin("naveen@gmail.com", "naveen@123")
			.doSearch("Nike shoes", 5000, "XYZ sports")
				.addToCart("Nike Shoes")
					.logout();
		
		//
		obj.doLogin("naveen@gmail.com", "naveen@123")
			.makePayment("naveen@hdfc")
				.generateOrderID()
					.logout();
		
		//
		obj.doLogin("naveen@gmail.com", "naveen@123")
			.doSearch("iPhone13")
					.logout();
		//
		obj.doLogin("naveen@gmail.com", "naveen@123")
			.logout();
		
		//
		obj.doLogin("naveen@gmail.com", "naveen@123");
		
		//
		obj.doLogin();

		//
		obj.logout();
		
		//
		obj.doLogin("admin@gmail.com", "admin@123")
			.doSearch("samsung");
	}

}
