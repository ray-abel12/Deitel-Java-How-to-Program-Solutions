package exercises;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		scan.close();
		if(number1 > number2) {
			System.out.println("number is greater");
		}else
			if(number2 > number1) {
			System.out.println("number is greater");
		}else {
			System.out.println("numbers are equal");
		}
		
		

	}

}
