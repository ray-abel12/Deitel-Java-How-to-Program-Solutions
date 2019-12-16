	package exercises;
	import java.security.SecureRandom;
	 
	public class ArrayRevision {
		
		int[] array = new int[21];
		SecureRandom rand = new SecureRandom();
		
	public void setArray() {
		int temp = 0;
		for(int i = 0; i < array.length; i++) {
		temp = 1 + rand.nextInt(5); 
		array[i] = 	temp;
		}
	}
	public void getValue() {
		setArray();
	      for(int i = 0; i < array.length;i++) {
	    	  
	    	  System.out.println(i + " " + array[i]);
	        }
	  }
		public static void main(String[] args) {
			
		ArrayRevision revision = new ArrayRevision();
		revision.getValue();	
		}
		}


