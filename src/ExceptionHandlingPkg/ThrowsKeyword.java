package ExceptionHandlingPkg;

public class ThrowsKeyword {
	
	public void m1() {
		m2();
	}

	public void m2() {
		try {
			m3();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public void m3() throws ArithmeticException {
		int i = 9 / 0;
	}

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();

		obj.m1();

		System.out.println("bye");
	}

}
