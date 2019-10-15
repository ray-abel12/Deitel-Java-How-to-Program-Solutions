package exercises;

import java.util.Scanner;

public class HypotenuseCalculations {
	
	public static double getHypo() {
		Scanner input = new Scanner(System.in);
		   System.out.println("enter the number of loop");
		   int num = input.nextInt();
		   
		   double hyp =0.0;
		   double a = 0.0;
		   double b =0.0;
		   for(int i = 1; i<=num ; i++) {
			   
			   System.out.println("enter the side1 value");
			   a =input.nextDouble();
			   System.out.println("enter the side2 value");
			   b =input.nextDouble();
			   
			   
			   
			hyp = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			System.out.println(hyp);
		   }
		   input.close();
		return hyp;
		
		
	}


	
     
}

