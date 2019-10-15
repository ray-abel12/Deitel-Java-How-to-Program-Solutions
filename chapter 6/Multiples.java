package exercises;

import java.util.Scanner;

public class Multiples {
	public static boolean isMultiple() {
		boolean result = true;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first pair");
		int a =input.nextInt();
		System.out.println("Enter the second pair");
		int b =input.nextInt();
		if(a % b == 0) {
			result = true;
		}else {
			result = false;
			input.close();
		}
		return result;
		
	}
}

