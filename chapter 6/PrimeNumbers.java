package exercises;

public class PrimeNumbers {
	 public static int isPerfect(int value) {
	    	//value =0;
	    	 for(int i=2; i < value; i++) {
              int div = value/2;
             int total = div %i;
	    		 if (total == 0) {
	    		  System.out.println(value+" " +"number is not a prime number");
	    		  break;
	    		 }else {
	    			 if (value!=0) {
	    			System.out.print(value+" "+"number is a prime number");	 
	    			break;
	    			 }
	    			 }
	    	     
	    	 
	     }
			return value ;
	    	 }

	}

