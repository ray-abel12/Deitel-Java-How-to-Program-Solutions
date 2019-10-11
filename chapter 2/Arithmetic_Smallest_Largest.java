package exercises;

import java.util.Scanner;

public class Arithmetic_Smallest_Largest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 integer value");
		
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		scan.close();
		
		System.out.print("sum: ");
		System.out.println(number1 + number2 + number3);
		System.out.print("average: ");
		System.out.println(number1 + number2 + number3/3);
		System.out.print("product: ");
		System.out.println(number1 * number2 * number3);
		
		if ((number1 > number2) && (number1 > number3)){
			System.out.println(number1 +" is the largest");
		}else
		if((number1 < number2) && (number1 < number3)) {
			System.out.println(number1 +" is the smallest");
			}else 
		if ((number2 > number1) && (number2 > number3)){
			System.out.println(number2 +" is the largest");
		}else
		if((number2 < number1) && (number2 < number1)) {
			System.out.println(number2 +" is the smallest");
			} 
		if ((number3 > number2) && (number3 > number1)){
			System.out.println(number3 +" is the largest");
		}else
		if((number3 < number2) && (number3 < number1)) {
			System.out.println(number3 +" is the smallest");
			} 
	}

}
