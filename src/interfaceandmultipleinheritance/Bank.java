package interfaceandmultipleinheritance;

public interface Bank {
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
}

// only methods declaration
// no body of the method -only method prototype
// variables declared in interface is static in nature
//variables  declared in interface can not  be changed
// interface are abstract in nature, no static method in interface 
//we can not create object of  interface 