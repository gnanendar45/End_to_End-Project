package com.BaseClass;

public class StarPattern {
	
	public static void main(String[] args) {
		/*for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}*/

	
	//another pattern
	
	/*for(int i=1; i<=4; i++) { //first line lo 4stars ni indicate chestadi
		for(int j=1; j<=i; j++) { // upto four rows one star upto four rows four stars
			System.out.print("*");
		}
		System.out.println();
	}

}*/
		
	/*
	 * for(int i=4; i>=1; i--) { for(int j=1; j<=i; j++) { System.out.print("*"); }
	 * System.out.println(); }
	 */
		
		//Even number and hard numbers
		
		/*
		 * for(int i=1; i<=10; i++) { if(i%2==0) { System.out.println(i); } }
		 * 
		 * for(int j=1; j<=10; j++) { if(j%2!=0) { System.out.println(j); } }
		 */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*
		 * for(int a=5; a>=1; a--) { for(int b=1; b<=a; b++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		
		/*
		 * for(int i=1; i<=5; i++) { for(int j=i; j< 5; j++) { System.out.print(" "); }
		 * for(int j=1; j<=i; j++) { System.out.print("* "); } System.out.println(); }
		 * 
		 * for(int a=5; a>=1; a--) { for(int b=a; b> 1; b--) { System.out.print(" "); }
		 * for(int b=1; b>=a; b--) { System.out.print("* "); } }
		 */
		/*
		 * String orginal ="gnanendar"; String reversed = ""; for(int
		 * i=orginal.length()-1; i>=0; i--) { reversed+= orginal.charAt(i); }
		 * System.out.println("orginal string: " +orginal);
		 * System.out.println("reversed string:" +reversed); int rows = 5; // Number of
		 * rows
		 * 
		 * for (int i = 1; i <= rows; i++) { // Outer loop for the number of rows //
		 * Print leading spaces for (int j = i; j < rows; j++) { System.out.print("  ");
		 * } // Print stars with a space between them for (int j = 1; j <= i; j++) {
		 * System.out.print("* "); } System.out.println(); // Move to the next line
		 * after each row }
		 */
		
		String org="gnanendar";
		String rev="";
		for(int i=org.length()-1; i>=0;i--) {
			rev+=org.charAt(i);
			System.out.println("orginal string: "+org);
			System.out.println("reversed: "+rev);
		}
		
	 int rows=5;
	 for(int i=rows; i>=1; i--) {
		 for(int j=1; j<=i; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 for(int i=1; i<=rows; i++) {
		 for(int j=1; j<=i; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 for(int i=rows; i>=1; i--) {
		 for(int j=i; j<rows; j++) {
			 System.out.print(" ");
		 }
		 for(int j=1; j<=i; j++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
	 
	 for(int i=1; i<=rows; i++) {
		 for(int j=i; j<rows; j++) {
			 System.out.print(" ");
		 }
		 for(int j=1; j<=i; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	}
}


