package Functions;

public class Functions {

	// function can not be created inside a function
	// functions should be independent to each other

	// 1. no input and no return:
	// void: does not return anything (no return keyword)
	// return type: void
	public void test() { // 0 parameter
		System.out.println("test method...");
	}

	// return type: void
	public void testing() {
		System.out.println("testing method....");
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a + b + c;
		System.out.println(sum);
	}

	// 2. no input but some return:
	// return type: int
	public int getMarks() {
		System.out.println("get marks...");
		int marks = 100;
		int bonus = 50;
		int totalMarks = marks + bonus;
		return totalMarks;
	}

	public String getName() {
		System.out.println("get name....");
		String name = "Tom";
		return name;
	}

	public char getChar() {
		System.out.println("get char value...");
		char c = 'a';
		return c;
	}

	// 3. some input and some return:
	// return type: int
	// params : 2 input params --> a,b
	public int sum(int a, int b) {
		System.out.println("sum method....");
		int z = a + b;
		return z;
	}

	// WAF: name --> getStudentMarks
	// input paramter: student name (String)
	// return : marks of the student --> int
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student name : " + studentName);
		int marks = -1;

		if (studentName.equals("Vani")) {
			marks = 90;
		} else if (studentName.equals("Garima")) {
			marks = 95;
		} else if (studentName.equals("Faritha")) {
			marks = 100;
		} else if (studentName.equals("Naveen")) {
			marks = 10;
		} else {
			System.out.println("please pass the right student name...." + studentName);
		}

		return marks;
	}
	
	
	
	public static void main(String[] args) {

		// call the function: create the object of this class:
				Functions obj = new Functions();

				int mk = obj.getStudentMarks("Tom");
				System.out.println(mk);

				obj.test();
				obj.testing();
				// System.out.println(obj.getMarks());

				int m = obj.getMarks();
				System.out.println(m - 20);

				String str = obj.getName();
				System.out.println(str);

				char c = obj.getChar();
				System.out.println((int) c);

				int sum = obj.sum(10, 20);
				System.out.println(sum);

				sum = obj.sum(40, 50);// 2 arguments/values
				System.out.println(sum);
	}

}
