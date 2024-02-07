package javaconcept;

public class StaticAndNonStatic {

	static String name = "thiru"; // static global variable
	int age = 26;// non static global variable

	public static void main(String[] args) {

		// need to create an object in order to access non static methods

		StaticAndNonStatic t = new StaticAndNonStatic();
		t.sum();

		System.out.println(t.age);

		// how to call static methods and variables
		// 1.direct calling:
		sendmail();
		// 2.calling by class name
		StaticAndNonStatic.sendmail();

		// for calling static variables
		// 1.direct calling:
		System.out.println(name);
		// 2.calling by class name
		System.out.println(StaticAndNonStatic.name);
		
		// can i access static method by using object reference?
		t.sendmail();// yes but it shows warning

	}

	public void sum() { // non static method
		System.out.println("Sum method");
	}

	public static void sendmail() { // static method

		System.out.println(" static method ");

	}

}
