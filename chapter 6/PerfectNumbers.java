package exercises;

public class PerfectNumbers {
	public static void isPerfect(int value) {
    
    	int sum = 0;
    	
    	 for(int i=1;i < value;i++) {

    		 if (value % i==0) {
    			sum =sum + i;
    			
    			//factors = factors + "," + i;
    			
    			System.out.println(i);
    		 }
    	 }
    	 if(sum==value) {
    		 System.out.println("the number is a perfect number");
    	 }else {
    		 System.out.println("is not a perfect number");
    	 }
    
     }
}
