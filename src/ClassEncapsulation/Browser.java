package ClassEncapsulation;

public class Browser {
	
	public void launchChrome() {
		System.out.println("launching chrome.....");
		checkRAM();
		checkOSCompatible();
		checkNetWorkConnection();
		checkBrowserVersion();
		System.out.println("chrome is launched.........");
	}

	private void checkRAM() {
		System.out.println("check ram");
	}

	private void checkOSCompatible() {
		System.out.println("check os");

	}

	private void checkNetWorkConnection() {
		System.out.println("check network");
	}

	private void checkBrowserVersion() {
		System.out.println("check version");

	}

}
