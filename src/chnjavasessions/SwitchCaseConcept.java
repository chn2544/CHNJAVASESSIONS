package chnjavasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Naveen";
		
		switch (name) {
		case "Tom":
			System.out.println("10 marks");
			break;
		case "Vaibhav":
			System.out.println("20 marks");
			break;
		case "Ravi":
			System.out.println("30 marks");
			break;
		case "Peter":
			System.out.println("40 marks");
			break;

		default:
			System.out.println("student name is not found...");
			break;
		}
		
		//
		String browser = "CHROME";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("plz pass the right browser...." + browser);
			
		}
		
		//use cases:
		//RBAC : admin, customer, seller, vendor, distributor
//		String role = "customer";
//		switch (role) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//env: QA, dev, stage, UAT, prod
		
		
		//
		double salary = 12.33;
		boolean flag = true;
		char c = 'i';
		switch (c) {
		case 'a':
			System.out.println("a");
			break;
		case 'e':
			System.out.println("e");
			break;
		case 'i':
			System.out.println("i");
			break;
		case 'o':
			System.out.println("o");
			break;
		case 'u':
			System.out.println("u");
			break;

		default:
			break;
		}
		
		
		
		
		//
		int marks = 100;
		switch (marks) {
		case 100:
			if(marks >=95) {
				System.out.println("Grade A++");
			}
			break;
		case 90:
			System.out.println("Grade A");
			break;
		case 80:
			System.out.println("Grade B");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
	}

}
