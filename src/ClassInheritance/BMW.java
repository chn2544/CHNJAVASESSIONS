package ClassInheritance;

public class BMW extends Car {
	
	// Method Overriding: Poly+Morphism (RunTime, Dynamic)
		// when you have a metho in parent class as well as the same method in child
		// class with:
		// 1. the same name
		// 2. the same number of parameters
		// 3. the same type of parameters
		// 4. the same parameter sequence
		// 5. the same return

		@Override
		public void start() {
			System.out.println("BMW -- start");
		}
		
		@Override
		public void fuelReading() {
			System.out.println("BMW -- fuel reading");
		}

		public void autoParking() {
			System.out.println("BMW -- auto parking");
		}
		
		//method hiding
		public static void getPrice() {
			System.out.println("BMW -- get price");
		}
		
//		private void info() {
//			System.out.println("BMW -- info");
//		}

}
