package exercises;

public class Time1Test {

	public static void main(String[] args) {
	// create and initialize a Time1 object
	   Time1 time = new Time1();   //invoke time1 constructor
	   System.out.print("print out obj Time ");
	   System.out.println(time);
	// change time and output updated time
	   time.setTime(13, 27, 6);
	   System.out.print(time);
	   //try invalid values 
	   try {
	   time.setTime(24, 55, 54);
	   }catch(IllegalArgumentException e){
		   System.out.printf("Exception: %s%n%n", e.getMessage()); 
	   }
	   System.out.println(time);
	}

}
