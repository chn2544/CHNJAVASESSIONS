package ExceptionHandlingPkg;

public class ThrowKeyword {
	
	public static void fetchData() throws Exception{
		String data = null;
		if (data == null) {
			throw new Exception("DATANOTFOUNDEXCEPTION");
		}
	}
	
	public static void useExcelData() {
		try {
			fetchData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	useExcelData();


	}

}
