package ConstructorConcept;

public class LoginPage {
	
	String username;
	String password;
	
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public boolean doLogin() {
		System.out.println("enter username : " + username);
		System.out.println("enter password : " + password);
		System.out.println("click on sign in button");
		System.out.println("home page is displayed....");
		return true;
	}
}
