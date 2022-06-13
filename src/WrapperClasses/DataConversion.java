package WrapperClasses;

public class DataConversion {

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);  // Integer is a wrapper class here
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		// String to int:
		String x = "100";
		System.out.println(x + 20);     //10020

		int i = Integer.parseInt(x);// 100
		System.out.println(i + 20);   //120

		String y = "100test";// NumberFormatException
		String y1 = y.split("test")[0];
		System.out.println(y1);
		int j = Integer.parseInt(y1);
		System.out.println(j + 20);

		System.out.println("------------");
		// String to double:
		String p = "12.33";
		System.out.println(p + 20);

		double d = Double.parseDouble(p);// 12.33
		System.out.println(d + 20);

		// String to boolean:
		String remote = "true";

		if (remote.equals("true")) {
			System.out.println("run test cases on docker AWS machine...");
		}

		if (Boolean.parseBoolean(remote)) {
			System.out.println("run test cases on docker AWS machine...");
		}

		// int to String:
		int g = 100;
		System.out.println(g + 20);// 120

		String billValue = String.valueOf(g);// "100"
		System.out.println(billValue + 20);// 10020

		//
		boolean isActive = true;

		if (isActive) {
			System.out.println("emp is active");
		}

		String check = String.valueOf(isActive);
		System.out.println(check + 20);

		byte b1 = 100;
		byte b2 = 120;

		int b3 = (b1 + b2);
		System.out.println(b3);

	}
}
