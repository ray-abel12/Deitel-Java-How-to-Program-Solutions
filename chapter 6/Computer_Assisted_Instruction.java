package exercises;

import java.security.SecureRandom;
import java.util.Scanner;

public class Computer_Assisted_Instruction {
   
	public static int question() {
	SecureRandom secure = new SecureRandom();
	
	int randomInteger1 = secure.nextInt(10);
	int randomInteger2 = secure.nextInt(10);
	
	System.out.println("how much is "+ randomInteger1+" times "+randomInteger2 );
	int total = randomInteger1 * randomInteger2;
	
	return total;
	}
	
	public static void solve() {
	
	Scanner scan = new Scanner(System.in);
		int i = 0;
	while(i != 1){
	int result = question();
	System.out.println("Enter answer");
	int response = scan.nextInt();
	
	
	if(response == result) {
		
		System.out.println("very good");
		
	    //i = scan.nextInt();
	}else
		while(response != result) {
			System.out.println("wrong ,please try again");
			response = scan.nextInt();
		//System.out.println("wrong ,please try again");
		//System.out.println(question());
		
		
	}
	System.out.println("run again 1 or 2");
	i = scan.nextInt();
	}
		
	}
	
}
