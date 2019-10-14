package exercise;
import java.util.Scanner;

public class SalaryCalculator {

		public double  salaryCalculator() {
			
		Scanner input = new Scanner(System.in);
		double total = 0;
		double div = 0;
		double to = 0;
		int hour = 0;
		
		for(int i=0; i < 3; i++) {
		System.out.println("Please enter workhour");
		hour = input.nextInt();
		
		if(hour < 40) {
		System.out.println("invalid input");
					
		}else 
		{ 
		div = hour -40;
		to=div/2; 
		total = to + div + 40  ;
		total = total * 10;
		System.out.printf("salary is %.2f%n", total);
				}
			}
			
			input.close();
			return total;
			
		}

	}

