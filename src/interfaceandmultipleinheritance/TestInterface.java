package interfaceandmultipleinheritance;

public class TestInterface {

	public static void main(String[] args) {
		
		USBank us =new USBank();
		us.credit();
		us.debit();
		us.transfermoney();
		us.carloan();
		us.personalloan();
		
		//dynamic polymorphism
		//child class object is referred by parent interface reference variable 
		
		Bank bk=new USBank();
		bk.credit();
		bk.debit();
		bk.transfermoney();
		
		

	}

}
