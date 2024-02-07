package javaprograms;

public class SubString {

	public static void main(String[] args) {
		String Str1 ="thirugnanam";
		String Str2 = " ";
		
		System.out.println(Str1.length());
		
		 if (Str1.length()>2) {
			 Str2= Str1.substring(Str1.length()-2);
		 } else {
			 Str1=Str2;
		 }
		 
		 System.out.println(Str2);

	}

}
