package exercises;

import java.util.Scanner;

public class SalesCommission {

	public static void sales() {
		
	int count;	
	int [] sales = new int [10]; 
	int grossSales;
	int [] frequency = new int [10];
	
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter Gross sales for the week:");
		for(count = 0; count < sales.length; count++) {	
			grossSales = input.nextInt();
				sales[count] = (int)((200 + (0.09 * grossSales )));
				if(sales[count] / 100 >= 10) {
					++frequency[count];
				}
				else if(sales[count] / 100 <= 9) {
					++frequency[count];
				}
		}
					
		System.out.println("Salary Range \t Number of People");
		for(count = 1; count < sales.length; count++) {
				if(count == 9) {					
				System.out.println("$ 1000 and over");
			}
			else {		
			System.out.println("$ "+ (100+( 100 * count) + "-" + (199+(count * 100)))+"\t\t"+ frequency[count]);
			input.close();
			}			
		}
	}
}




