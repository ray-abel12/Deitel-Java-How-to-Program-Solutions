package exercises;

import java.util.Scanner;

public class ReversingDigitsTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter number");
		int number = scan.nextInt();
		 ReversingDigits.reverse(number);
		 scan.close();

	}

}
