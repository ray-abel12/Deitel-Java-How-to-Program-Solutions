package exercises;

import java.util.Scanner;

public class SeparatingDigitsTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a");
		int a = scan.nextInt();
		
		System.out.println("enter b");
		int b = scan.nextInt();
		SeparatingDigits.getRemainder(a, b);
		scan.close();
	}

}
