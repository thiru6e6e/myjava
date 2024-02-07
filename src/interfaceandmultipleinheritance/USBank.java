package interfaceandmultipleinheritance;

public class USBank implements Bank {
	
	public void credit() {
		System.out.println("us bank  credit ");
	}
	
	public void debit() {
		System.out.println("US bank debit");
	}
	
	public void transfermoney() {
		System.out.println("US bank money transfer");
	}
	
	public void carloan() {
		System.out.println("US car loan");
	}
	
	public void personalloan() {
		System.out.println("Us bank personal loan");
	}
	 

}
