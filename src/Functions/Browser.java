package Functions;


import java.util.Arrays;

public class Browser {

	public String[] getEmpDevices(String empName) {
		System.out.println("employee name is : " + empName);

		//String product[];

		if (empName.equalsIgnoreCase("Divya")) {
//			product[0] = "macbook pro";
//			product[1] = "macbook air";
//			product[2] = "iphone 12";
//			product[3] = "ipad";
//			product[4] = "apple mouse";
			String product[] = {"macbook pro", "macbook air", "iphone 12"};
			return product;
		}

		else if (empName.equalsIgnoreCase("Prashant")) {
//			product[0] = "Windows Dell";
//			product[1] = "samsung s9";
//			product[2] = "Dell mouse";
			String product[] = {"Windows Dell", "samsung s9", "Dell mouse"};
			return product;
		}

		else {
			System.out.println("emp name is not found..." + empName);
			return null;
		}

	}

	public static void main(String[] args) {
		Browser br = new Browser();
		String dev[] = br.getEmpDevices("Chinmay");
		System.out.println(Arrays.toString(dev));
		String dev1[] = br.getEmpDevices("Divya");
		System.out.println(Arrays.toString(dev1));

	}

}


