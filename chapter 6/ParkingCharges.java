package exercises;

import java.util.Scanner;

public class ParkingCharges {
	
	public static double calculateCharges() {
		
		Scanner input = new Scanner(System.in);
		
		
		double total = 0.0;
		double normalCharge = 2.00;
		double all = 0.0;
		int numberOfHours = 0;
		int extraHours = 0;

		System.out.println("Enter the number of Customers that parked for Yesterday: ");
		int num = input.nextInt();
	
		System.out.println("Enter number of hours worked: ");
		
		for(int i = 1; i <= num; i++) {
			
			numberOfHours = input.nextInt();
			if(numberOfHours < 1 || numberOfHours > 24) {
				System.out.println("Error, input an absolute integer!!!");
				System.out.println();
				System.out.println("Enter number of hours worked: ");
			}
			
			if(numberOfHours == 1 && numberOfHours <= 3) {
				
				total = normalCharge;
				System.out.println("$" + total);
			}
			else if(numberOfHours > 3 && numberOfHours <= 19) {
				
			
				extraHours = numberOfHours - 3;
				total =  normalCharge + 0.5 * (extraHours);
				
				System.out.println("The total charge is: $" + total);
			}
			else {
				total = 10.00;
				System.out.println("The total charge for 24hours is:" + "$" + total);
			}
			all +=total;
		}
		input.close();
		return all;
		
	}
}
