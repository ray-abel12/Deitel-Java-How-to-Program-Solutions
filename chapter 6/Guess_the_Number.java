package exercises;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_Number {
	
	public static void guess() {
		
	Random random = new Random();
	Scanner scan = new Scanner(System.in);
	
	int rand = random.nextInt(1000);
	
	int i = 0;
	
	
	while(i != 1) {
	System.out.println("prompt Guess Between 1 to 1000");
	int input = scan.nextInt();
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
	//	input = scan.nextInt();
		}else
		
			
		if(input < rand) {
		System.out.println("too low try again");
		int randValue = rand + 10;
		int randValue2 = rand - 20;
	    System.out.println(randValue+"-" +randValue2 );
	//	i++;
		}
		//scan.close();
		}
		}
	}

