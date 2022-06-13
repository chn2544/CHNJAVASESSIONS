package Abscraction;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.header();
		lp.title();
		lp.url();
		lp.pageTimeOut();
		lp.doLogin("admin", "admin123");
		lp.forgotPwd();
		
		lp.footer();
		lp.logo();
		
		//top casting:
		Page p = new LoginPage();
		p.header();
		p.url();
		p.title();
		p.pageTimeOut();
	}

}
