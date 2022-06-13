package Abscraction;

public abstract class Page {
	//partial abstraction (0 to 100%)
		//100% abstraction
		//0% abstraction
		//abstract class object can not be created
		//we can create the const... of abstract class, 
		//it will be called when you create the object of child class
		
		public Page() {
			System.out.println("Page ..const....");
		}
		
		public Page(int a) {
			System.out.println("Page ..const...." + a);
		}
		
		public abstract void title();

		public abstract void header();

		public abstract void url();

		public void pageTimeOut() {
			System.out.println("Page time out -- 20 secs");
		}

		public void footer() {
			System.out.println("Page footer");
		}
		
		public final void logo() {
			System.out.println("app Logo");
		}
}
