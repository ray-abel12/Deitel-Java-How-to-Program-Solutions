package exercises;

import java.util.Scanner;

public class Odd_or_Even {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value ");
		int value = scan.nextInt();
		scan.close();
		
		if(value % 2 == 0) {
			System.out.println(value + " is Even");
		}else {
			System.out.println(value +" is Odd");
		}

	}

}
