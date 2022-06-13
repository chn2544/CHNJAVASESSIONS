package ClassEncapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		// 
		
				Customer obj = new Customer("Garima", 25, true);
				
				//GET
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.isActive());
				
				
				// Question is if constructor is setting values, why setter is required ?
				// Answer - If user wants to update the data, setter is required as follows : 
				
				//update: PUT/PATCH
				obj.setName("Garima Goel");
				obj.setActive(false);
				obj.setAge(27);
				
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.isActive());
				
				//update: PUT
				obj.setActive(true);
				
				//GET
				System.out.println(obj.getName());
				System.out.println(obj.getAge());
				System.out.println(obj.isActive());


				
				
				
				
				
				

	}

}
