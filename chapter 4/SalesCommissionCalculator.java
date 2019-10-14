package exercise;

import java.util.Scanner;

	public class SalesCommissionCalculator {
		public double salesCalculator() {
			
			Scanner input = new Scanner(System.in);
			
			double total = 0;
			double counter = 0;
			double calc = 0;
			int value = 0;
			
			while(counter != -1) {
			System.out.println("please enter price list");
			value = input.nextInt();
			total = total +(double) value;
			calc = total * 9 /100 ;
			calc+=200;
	        counter++;
	        
	        System.out.println("please enter -1 to quit or any other value to continue");
	        counter = input.nextDouble(); 				
			}
			System.out.println("commission for staff is $" +calc);	
			input.close();
			return calc;
			
		}
		
	}

