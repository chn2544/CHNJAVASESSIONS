package Abscraction;

public class LoginPage extends Page{

	public LoginPage() {
		System.out.println("LP -- const...");
	}
	
	public LoginPage(int a) {
		System.out.println("LP -- const..." + a);
	}

	@Override
	public void title() {
		System.out.println("Amazon Login");
	}

	@Override
	public void header() {
		System.out.println("Amazon Login Header");
	}

	@Override
	public void url() {
		System.out.println("https://www.amazon.com");
	}
	
	@Override
	public void pageTimeOut() {
		System.out.println("Login Page time out -- 10 secs");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with : " + un + ":" + pwd);
	}
	
	public void forgotPwd() {
		System.out.println("forgot pwd test");
	}
}
