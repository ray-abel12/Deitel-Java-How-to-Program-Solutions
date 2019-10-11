package exercises;

import java.util.Scanner;

public class Largest_and_Smallest_Integers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 5 integer value");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		scan.close();
		
		if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)){
			System.out.println(num1 + " is largest");
		    }
		if ((num1 < num2) && (num1 < num3) && (num1 < num4) && (num1 < num5)){
			System.out.println(num1 + " is smallest");
			}
	    if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)){
			System.out.println(num2 + " is largest");
			}
		if ((num2 < num1) && (num2 < num3) && (num2 < num4) && (num2 < num5)){
			System.out.println(num2 + " is smallest");
			}
		if ((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)){
			System.out.println(num3 + " is largest");
			}
		if ((num3 < num1) && (num3 < num2) && (num3 < num4) && (num3 < num5)){
			System.out.println(num3 + " is smallest");
			}
		if ((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)){
			System.out.println(num4 + " is largest");
			}
		if ((num4 < num1) && (num4 < num2) && (num4 < num3) && (num4 < num5)){
			System.out.println(num4 + " is smallest");
			}
		if ((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4)){
			System.out.println(num5 + " is largest");
			}
		if ((num5 < num1) && (num5 < num2) && (num5 < num3) && (num5 < num4)){
			System.out.println(num5 + " is smallest");
			}
		
	

	}

}
