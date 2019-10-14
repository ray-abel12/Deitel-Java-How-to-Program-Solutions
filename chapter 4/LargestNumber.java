package exercise;
import java.util.Scanner;

public class LargestNumber {
	
	public void largeNumber(){
		
	Scanner input = new Scanner(System.in);
	
	int counter = 0;
	int number = 0;
	int largest = 0;
	
	while(counter < 10) {
	System.out.println("Enter the nuumber");
	number = input.nextInt();
	if(largest < number)
		largest = number;
		 counter++ ;	
	}
	System.out.println(largest);

	input.close();
	}
		
	}

