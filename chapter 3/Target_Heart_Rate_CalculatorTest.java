package exercises;

import java.util.Scanner;

public class Target_Heart_Rate_CalculatorTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Target_Heart_Rate_Calculator rate = new Target_Heart_Rate_Calculator(null, null, 0, 0, 0);
		System.out.println("enter firstName");
		String firstName = scan.nextLine();
		rate.setFirstName(firstName);
		
		System.out.println("enter lastName");
		String lastName = scan.nextLine();
		rate.setLastName(lastName);
		
		System.out.println("enter year of birth");
		int year = scan.nextInt();
		rate.setYear(year);
		System.out.println("enter month of birth");
		int month = scan.nextInt();
		rate.setMonth(month);
		System.out.println("enter day of birth");
		int day = scan.nextInt();
		rate.setDay(day);
		System.out.println("enter currentYear");
		int currentYear = scan.nextInt();
		scan.close();
		rate.age(currentYear);
		System.out.println("my firstName is: "+rate.getFirstName());
		System.out.println("my lastName is: "+rate.getLastName());
		rate.maximumHeart(26);
		rate.heartRate(34);
		
		
	}

}
