package exercises;

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
	
	public static int quotent(int numerator, int denominator) {
		
		return numerator/denominator;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PLEASE ENTER AN INT NUMERATOR");
		int numerator =scan.nextInt();
		
		System.out.println("PLEASE ENTER AN INT DENOMINATOR");
		int denominator=scan.nextInt();
		
		int result = quotent(numerator,denominator);
		
		System.out.println(result);

	}

}
