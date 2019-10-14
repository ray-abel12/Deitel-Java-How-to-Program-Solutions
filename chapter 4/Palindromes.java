package exercise;

import java.util.Scanner;

public class Palindromes {

	
public void scan() {		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("enter 5 values");
	
	 int input = scan.nextInt();
	 int num1 = input /10_000;
	 int num2 = input /10_00;
	 num2 = num2%10;
	 int num3 = input/10_0;
	 num3 = num3%10;
	 int num4 = input/10;
	 num4 = num4%10;
	 int num5 = input/1;
	 num5 = num5%10;
	 scan.close();
	if ((num1 == num5) && (num2 == num4)){
		System.out.println("this is a palindrome");
	}else {
		System.out.println("this is not a palindrome");
	}

	}
}

