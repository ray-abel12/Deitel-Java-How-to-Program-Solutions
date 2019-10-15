package exercises;

import java.util.Scanner;

public class ExponentiationTest {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Exponentiation exponent = new Exponentiation();
		
		System.out.println("enter base");
		int base = scan.nextInt();
		
		System.out.println("enter exponent");
		int exponent1 = scan.nextInt();
		
		exponent.integerPower(base,exponent1);
		scan.close();

	}

}
