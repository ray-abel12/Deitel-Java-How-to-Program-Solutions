package exercises;

import java.util.Scanner;

public class SalesCommissions {
	public static void sales() {
		int [] count = {200,300,400,500,600,700,800,900,1000};
		int [] gross = new int [10];
		
	Scanner scan = new Scanner(System.in);
	
	for (int i = 0; i < count.length; i++) {
		
		int counter = count[i] ;
		int counter2 = count [i] + 99;
		String total = counter+"-"+counter2;
		System.out.println(total);
		
	}
	
	System.out.println("enter gross values");
	for (int i = 0; i < gross.length;i++) {
		int gross1 = scan.nextInt();
		gross[i] = gross1;
	//	if (gross[i] < counter2 && (gross[i] > counter)) {
			
		//}
	
	}
	}
}


