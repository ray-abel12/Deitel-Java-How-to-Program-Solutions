package exercises;

import java.util.Scanner;

public class Argument {
	
	public static boolean condition(int value1,int value2) {
		if (value1 == value2) {
		   return true;
	}
	       return false;
	
	}
    public static void main(String[] args){
    	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter value for comparism");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	if (condition(num1,num2)==true ) {
		System.out.println("true");
	}else {
		System.out.println("beautiful error");
		scan.close();
	}
    }


}
