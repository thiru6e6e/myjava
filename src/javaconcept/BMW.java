package javaconcept;

public class BMW extends Car {
	
	
	// when same method name is present  in parent class as well as in child class with same name and 
	//same number of arguments is called method overriding 
	public void start() {
		System.out.println("Start the  BMW Car");
	}
	
/*public void stop() {
		System.out.println("Stop the  BMW Car");
	}*/
	
	public void system() {
		System.out.println("BMW system");
	}
	
	public void light(){
		System.out.println(" BMW light");
	}

}
