package javaprograms;

public class Reverseword {

	public static void main(String[] args) {
		String R = "i need to reverse this word";
		String R1 = " ";
		String R2[] =R.split(" ");
		System.out.println(R2.length);
		
		 for (int i=R2.length-1;i>=0;i--) {
			 R1 = R1 + R2[i] + " ";
		 }
		 
		 System.out.println(R1);

	}

}
