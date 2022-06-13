package WebDriverArch_Interface;

public class AmazonTest {

	static WebDriver driver;

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "safari";

		System.out.println("browser name is : " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			 driver = new SafariDriver();
		} else {
			System.out.println("please pass the right browser....." + browser);
		}

		driver.get("http://abc.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getUrl();
		System.out.println(url);

		driver.sendKeys("emailId", "admin@gmail.com");
		driver.sendKeys("password", "admin@123");
		driver.click("LoginBtn");

		driver.closeBrowser();

	}

}
