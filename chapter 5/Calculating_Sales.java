package exercise;

import java.util.Scanner;

public class Calculating_Sales {
  
	private final double product1 = 1.95;
	private final double product2 = 4.50;
    private final double product3 = 9.98;
	private final double product4 = 4.49;
    private final double product5 = 6.87;
	
public void sales() {
 
	double total = 0;
	int i = 0;
	
	while(i !=-2) {
		
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("enter -2 to end ");
	i = scan.nextInt();
		
	System.out.print("enter quantity ");
	double quantity1 = scan.nextDouble();
	System.out.print("enter product from 1-5 ");
	int value = scan.nextInt();
	
	switch(value) {
	case 1:
	total = product1 * quantity1;
	break;
	case 2:
    total = product2 * quantity1;
	break;
	case 3:
	total = product3 * quantity1;
	break;
	case 4:
	total = product4 * quantity1;
	break;
	case (int) 5:
	total = product5 * quantity1;
	break;
	default:
		System.out.println("error not available");
		i++;
		total += total ;
		
	
		
		scan.close();
		}
	
	//total = 1 + 2 + 3 + 4 + 5  ;
	
	
	

}
	System.out.println("total value of all sales is: "+total);
}	
		
	}
