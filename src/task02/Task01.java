package task02;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		int lensmax = Integer.MIN_VALUE;
		int lensmin = Integer.MAX_VALUE;
		String smin = new String();
		String smax = new String();
		String setalon = new String();
		
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter N strings.");
		do {
			System.out.print("Enter string's chars: ");
			setalon = sin.nextLine();
			if (setalon.length() >= lensmax) {
				smax = setalon;
				lensmax = setalon.length();
			}
			if (setalon.length() <= lensmin && setalon.length() > 0) {
				smin = setalon;
				lensmin = setalon.length();
			}
		} while (setalon.length() > 0);
		System.out.println();
		if(lensmax > lensmin) {
			System.out.println("Longest string: " + smax);
			System.out.println("string length: " + lensmax);
			System.out.println("Shorter string: " + smin);
			System.out.println("string length: " + lensmin);			
		}else if (lensmax != 0) {
			System.out.println("String equals");
		}else {
			System.out.println("Not enoght strings");
		}
		
	}

}
