package exercises;

import java.security.SecureRandom;

public class Dice_Rolling {
static int[] array = new int[13];

static SecureRandom random = new SecureRandom();

public static int roll() {
		
   
	int first_roll = 1 + random.nextInt(6);
	int second_roll = 1 + random.nextInt(6);
	int total = first_roll + second_roll;
	return total;
}
	public static void count() {
		
		for(int i = 0;i <= 36_000;i++) {
		int temp = roll();
		array[temp]++;
		 
	}
		
	}
	
	public static void result() {
		
        
		for (int i = 0 ; i < array.length; i++) {
			System.out.println(i + "  "+array[i]);
		}
	}
	}

