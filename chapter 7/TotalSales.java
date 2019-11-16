package exercises;

import java.security.SecureRandom;

public class TotalSales {

public static void main(String []args) {
	SecureRandom random = new SecureRandom();
	final int row = 5;
	final int col = 4;
	int[][] sales = new int[row][col];	
	int total = 0;
//	int total2 = 0;

	for(int product = 0; product < sales.length; product++) {
		for(int salesperson = 0; salesperson < sales[product].length; salesperson++) {
			sales[product][salesperson] = random.nextInt(50);
			

}
	}
	for(int product = 0; product < sales.length; product++) {
		for(int salesperson = 0; salesperson < sales[product].length; salesperson++) {
			total += sales[product][salesperson];
		//	total2 = sales[product]; 
			System.out.printf("%d\t",sales[product][salesperson]);
}
		System.out.println(total);
}
}
}

