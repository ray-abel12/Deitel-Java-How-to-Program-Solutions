package exercises;

import java.util.Scanner;

public class SquareOfAsterisks {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		int value = 0;
		System.out.println("enter the value");
		value = input.nextInt();
		for(i=1; i<=value;i++) {
		  for(j=1; j<=value;j++){
			System.out.print("*");
		  }
			System.out.println("");

		}

		input.close();
	}


	}


