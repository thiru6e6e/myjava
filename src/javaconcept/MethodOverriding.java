package javaconcept;

public class MethodOverriding {
	
	// whenever the there is same method name in both parent class(Car) and Child class(BMW) 
			//the preference will be given to child class method first

	public static void main(String[] args) {
		
		// static polymorphism or compile time polymorphism
		//at compile time jave will decide which method  should it call for start()
		BMW cd =new BMW();
		cd.start();
		cd.fuelcheck();
		cd.speedcheck();
		cd.system();
		cd.light();
		cd.stop();
		
		System.out.println("object of parent class");
		
		
		Car c = new Car();
		c.start();
		c.fuelcheck();
		c.speedcheck();
		c.stop();
		
		System.out.println("dynamic polymorphsim");		
		Car t = new BMW();//child class object can be refered by  parent class reference variable--dynamic polymorphism or run time polymorphism
		t.start();
		t.fuelcheck();
		t.speedcheck();
		t.stop();
	}

}
