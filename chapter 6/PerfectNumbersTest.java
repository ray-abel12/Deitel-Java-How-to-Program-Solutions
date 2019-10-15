package exercises;

import java.util.Scanner;

public class PerfectNumbersTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a value");
		int value = scan.nextInt();
		
		PerfectNumbers.isPerfect(value);
		scan.close();

	}

}
