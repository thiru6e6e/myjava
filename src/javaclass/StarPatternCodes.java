package javaclass;

public class StarPatternCodes {

	public static void main(String[] args) {
		
		// outer loop,it always represents row

		for (int i = 0; i <= 4; i++) {
			// inner loop, it always represents columns
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		System.out.println("-----------------------");

		for (int i = 0; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------");
		
		for(int i=0;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		
		int alpha = 65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j) + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		int alphat = 65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)alphat + " ");
			}
			alphat++;
			System.out.println();
		}
		

	}

}
