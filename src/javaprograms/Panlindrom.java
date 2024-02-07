package javaprograms;

public class Panlindrom {

	public static void main(String[] args) {
		String S1 = "thiru";
		String S2 = " ";

		for (int i = S1.length()-1; i >= 0; i--) {
			S2 = S2+S1.charAt(i);
		}
		System.out.println(S2);
		
		if(S1.equals(S2)) {
			System.out.println("the given String is palindrom");
		} else
			System.out.println("the Given String is not palindrom");
		
	}

}
