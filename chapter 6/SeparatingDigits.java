package exercises;

public class SeparatingDigits {
	
		int value = 0;
		int a = 0;
		int b = 0;
		public static int quotient(int a, int b) {
			
			return a / b;
			
		}
		public static int getRemainder(int a,int b) {
			
			return a % b;
			
		}


		public static void displayDigits(int c) {
			String  temp = "";
			
			int digit = 0;
			
			while(c != 0) {
				
				digit = c % 10; 
				temp = digit + "  " + temp;
						
				c /= 10;
			}
			System.out.print(temp);
			System.out.println();
			
		}
}
