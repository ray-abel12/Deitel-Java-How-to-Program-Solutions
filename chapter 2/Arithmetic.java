package exercises;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number 1 and number 2");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println(num1 + num2 );
		System.out.println(num1 * num2 );
		System.out.println(num1 / num2 );
		System.out.println(num1 % num2 );

		input.close();
	}

}
