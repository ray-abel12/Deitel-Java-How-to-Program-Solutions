package exercises;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_Number_modified {
	public static void guess() {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int rand = random.nextInt(1000);
		
		int i = 0;
		int guess = 0;
		
		while(i != 1) {
		System.out.println("prompt Guess Between 1 to 1000");
		
		int input = scan.nextInt();
		 if(guess<=10) {
		    	System.out.println("you got lucky");
			}else 
				if(guess >10) {
			System.out.println("Aha, you should be able to do better");
			}
		if(input == rand ) {
			System.out.println("congratulation");
			System.out.print("Do you want to play again 1 or 2");
			i = scan.nextInt();
			continue;
		}else
			if(input > rand) {
			System.out.println("too high try again");
			int randValue = rand + 10;
			int randValue2 = rand - 20;
		    System.out.println(randValue+"-" +randValue2 );
		    guess+=1;
		    System.out.println(guess);
		    
			}else
			
				
			if(input < rand) {
			System.out.println("too low try again");
			int randValue = rand + 10;
			int randValue2 = rand - 20;
		    System.out.println(randValue+"-" +randValue2 );
	        guess+=1;
	        System.out.println(guess);
	       
			}
		
			}
			}
}
