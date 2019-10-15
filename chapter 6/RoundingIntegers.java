package exercises;

import java.util.Scanner;

public class RoundingIntegers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double x =0;
	
   //System.out.println(x);
   for(int i=1; i<=5; i++) {
	   System.out.println("please enter value");
	   x =input.nextDouble();
	   double y = Math.floor(x + 0.5);
	   System.out.printf("%.2f%n ",y);
   }
   input.close();
	}
}
