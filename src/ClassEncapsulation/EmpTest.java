package ClassEncapsulation;

import java.util.ArrayList;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		
		e.setName("Garima");
		e.setAge(20);
		e.setCity("LA");
		String name = e.getName();
		System.out.println(name);
		
		String empData = e.getEmpData();
		System.out.println(empData);
		
		
		//
		User u1 = new User();
		u1.name = "Tom";
		u1.age = 20;
		u1.setSalary(23.33);
		
		ArrayList<String> devList = new ArrayList<String>();
		devList.add("macbook pro");
		devList.add("iph 12");
		u1.setDeviceList(devList);
		
		System.out.println(u1.name + " " + u1.age + " " + u1.getSalary() + " " + u1.getDeviceList());
		
		//
		AppLogin app = new AppLogin();
		app.setUsername("admin@gmail.com");
		app.setPassword("admin@123");
		app.doLogin(app.getUsername(), app.getPassword());
		
		AppLogin app1 = new AppLogin();
		app1.setUsername("tom@gmail.com");
		app1.setPassword("tom@123");
		app1.doLogin(app1.getUsername(), app1.getPassword());
		
	}
	
	}

