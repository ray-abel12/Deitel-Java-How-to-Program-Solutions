package exercises;

public class ReversingDigits {
	public static int reverse(int number) {
		int reverse = 0;
		//int number =0;
		int digit = 1;
    	while(number != 0) {
         digit = number % 10;
         reverse =(reverse * 10) + digit;
    		 number/=10;
    	 }
		return reverse;
    
     }
}

