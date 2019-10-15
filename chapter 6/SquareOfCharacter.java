package exercises;

import java.util.Scanner;

public class SquareOfCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		int value = 0;
		System.out.println("enter the value");
		value = input.nextInt();
		System.out.println("enter any character");
		char fill =input.next().charAt(0);
		for(i=1; i<=value;i++) {
		  for(j=1; j<=value;j++){
			System.out.print(fill);
		  }
			System.out.println("");

		}

		input.close();
	
    }
}

	
