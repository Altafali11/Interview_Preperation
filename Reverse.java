package codeit_preperation;

import java.util.Scanner;

// code Written by Altaf
// String Reverse
public class Reverse {
	public static void main(String[] args) {
		System.out.println("write String character");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev= rev+str.charAt(i);	
		}
		System.out.println(rev);

	}

}
