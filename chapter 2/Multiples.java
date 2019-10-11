package exercises;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 values to get multiple ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	    scan.close();
	    
	    if(num1 % num2==0) {
	    	System.out.println(num2 + " is not a multiple");
	    }else {
	    	System.out.println(num2 + " is a multiple");
	    }
	}

}
