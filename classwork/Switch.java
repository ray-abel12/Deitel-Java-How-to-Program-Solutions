package exercises;

public class Switch {

	public static void main(String[] args) {
	
		String fruit = "nut";
		switch(fruit) {
		case "mango" :
			System.out.println("first case");
			break;
		case "apple"  :
			System.out.println("second case");
			break;
	    default :
	    	System.out.println("big error");
		}

	}

}
