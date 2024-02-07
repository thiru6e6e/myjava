package javaconcept;

public class MethodOverloading {

	// methodOverloading -- when the method name is same with different number of
	// Arguments 0r
	// different input parameters and different type of argument within the same
	// class is called method Overloading

	// we are not able to create method inside the method

	// we can overload main method also

	public static void main(String[] args) {

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(2, 3);
		obj.sum(1.3);

	}

	public void sum() {
		System.out.println("First Sum method--zero parameters");
	}

	public void sum(int i) {
		System.out.println("Second sum method--Single parameter");
		System.out.println(i);
	}

	public void sum(int i, int j) {
		System.out.println("third sum method--two parameter with same datatype");
		System.out.println(i + j);

	}
	
	public void sum(double d) {
		System.out.println("Single parameter Sum methos with diffrent type of argu");
		System.out.println(d);
	}

}
