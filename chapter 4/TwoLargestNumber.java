package exercise;

import java.util.Scanner;

public class TwoLargestNumber {
	
	public void largeNumber(){
		
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int number = 0;
		int largest = 0;
		int secondlargest=0;
		
		while(counter < 10) {
			System.out.println("Enter the nuumber");
			number = input.nextInt();
			if(largest < number)
				largest = number;
			else {
				if(largest < secondlargest)
					largest = secondlargest;
				
			}
			counter++ ;	
		}
		System.out.println(largest);
		System.out.println(secondlargest);

		input.close();
		}
			
		}

