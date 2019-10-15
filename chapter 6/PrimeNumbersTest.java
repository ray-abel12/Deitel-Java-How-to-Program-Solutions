package exercises;

import java.util.Scanner;

public class PrimeNumbersTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter value");
		int value = scan.nextInt();
		PrimeNumbers.isPerfect(value);
		scan.close();

	}

}
