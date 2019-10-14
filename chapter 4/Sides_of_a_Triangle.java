package exercise;

import java.util.Scanner;

public class Sides_of_a_Triangle {
  
	public void sides() {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("enter sideA,sideB and sideC");
	
	int sideA = scan.nextInt();
	int sideB = scan.nextInt();
	int sideC = scan.nextInt();
	
	if (sideA + sideB == sideC) {
		System.out.println("they can represent the sides of a triangle.");
	}else {
		System.out.println("they cant represent the sides of a triangle");
		scan.close();
	}
	}
}
