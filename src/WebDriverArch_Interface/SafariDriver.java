package WebDriverArch_Interface;

public class SafariDriver implements WebDriver{
	
	public SafariDriver() {
		System.out.println("launching Apple Safari");
	}

	@Override
	public void get(String url) {
		System.out.println("entering url : " + url);
	}

	@Override
	public String getTitle() {
		return "Amazon Shopping";
	}

	@Override
	public String getUrl() {
		return "https://www.abc.com";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering the value : " + value + " to : " + element);
	}

	@Override
	public void closeBrowser() {
		System.out.println("close browser");
	}
}
