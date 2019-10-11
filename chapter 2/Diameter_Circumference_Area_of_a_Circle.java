package exercises;

import java.util.Scanner;

public class Diameter_Circumference_Area_of_a_Circle {

	public static void main(String[] args) {
     
	Scanner scan = new Scanner(System.in);
	System.out.println("enter radius value of circle");
	int radius = scan.nextInt();
	scan.close();
	
	System.out.printf("The circle diameter is : %d%n", 2 * radius);
	System.out.printf("The circumference is : %.1f%n", 2 * 3.14159 * radius);
    System.out.printf("The area is : %.1f", 3.14159 * radius * radius);

	}

}
