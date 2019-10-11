package exercises;

import java.util.Scanner;

public class Body_Mass_Index_Calculator {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your height and weight");
	int weight = scan.nextInt();
	int height = scan.nextInt();
	scan.close();
	int bmi = weight * 703 / height * height;
	System.out.println(bmi);

	}

}
