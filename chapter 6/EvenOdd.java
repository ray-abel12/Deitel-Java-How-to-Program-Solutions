package exercises;

import java.util.Scanner;

public class EvenOdd {
	
		public static boolean isEven() {
			boolean result = true;
			Scanner input = new Scanner(System.in);
			int seq = 0;
			int value = 0;
			int b = 2;
			System.out.println("please enter the no of numbers to input");
			seq =input.nextInt();
			for(int i = 1; i<=seq; i++) {
				System.out.println("please enter the value ");
				value = input.nextInt();
				if(value==-1) {
					System.out.println("enter -1 to end loop");
					break;
				}else if(value%b==0) {
					result = true;
				}else {
					result = false;
				}
					System.out.print(result);
					System.out.println();
				}
			
			input.close();
			return result;
	       
		}
		
}
