package WebDriverArch_Interface;

public interface WebDriver {

	public void get(String url);
	
	public String getTitle();
	
	public String getUrl();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public void closeBrowser();
	
}
