package ClassInheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start();//overriden from parent   - BMW - start
		b.stop();//inherited   --    car stop 
		b.refuel();//inherited    --- car -- refuel 
		b.autoParking();//individual   --- bmw autoparking  
		b.engine();//inherited  from grandparent   - vehicle engine 
		b.fuelReading();//overriden	 from grandparent - bmw fuel 
		BMW.getPrice();
		b.billing();
		
		Car c = new Car();
		c.start();   //individual
		c.stop();   //individual  
		c.refuel();  //individual 
		c.engine();    //inhereted from parent 
		c.fuelReading();   //inherited from parent 
		
		
		//top/up casting: 
		//child class object can be referred by parent class ref variable
		Car c1 = new BMW();
		c1.start();    //overriden method will be called -  bmw start will be output as object of bmw is created and reffered by c1
		c1.stop();    // individual of car
		c1.refuel();  // individual of car
//		c1.autoParking(); // This is not allowed as this is individual method of BMW class
		
		
		Car c2 = new Audi();
		c2.start();
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		

		//down casting:
		//parent class object is referred by child class ref varibale?
		//BMW b1 = (BMW)new Car();//ClassCastException -- RunTime
		//b1.start();

	}

}
