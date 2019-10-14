package exercise;

import java.util.Scanner;

public class SquareOfAsterisks {
	  public static void main(String[] args) {
			
		  Scanner input = new Scanner(System.in);
			System.out.println("Enter the size of the square");
			int value =input.nextInt();
			if((value<=20)&&(value>=1)) {
	        for(int i = 1; i <= value; i++) {
	        	for(int j=1; j<=value; j++) {
	        		System.out.print("*");
	        	}
	        	System.out.println();
	        }
	        }else {
	            	System.out.println("invalid input");
	        }
	     input.close();   	

		}
}


