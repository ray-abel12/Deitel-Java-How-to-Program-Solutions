package exercises;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	HealthProfile profile = new HealthProfile(null, null, null, 0, 0, 0, 0, 0);
	
	System.out.println("enter firstName");
	String firstName = scan.nextLine();
	profile.setFirstName(firstName);
	
	System.out.println("enter lastName");
	String lastName = scan.nextLine();
	profile.setLastName(lastName);
	
	System.out.println("enter year of birth");
	int year = scan.nextInt();
	profile.setYear(year);
	
	System.out.println("enter gender");
	String gender = scan.nextLine();
	profile.setGender(gender);
	
	
	System.out.println("enter height");
	int height = scan.nextInt();
	profile.setHeight(height);
	
	System.out.println("enter weight");
	int weight = scan.nextInt();
	profile.setWeight(weight);
	
	
	System.out.println("enter month of birth");
	int month = scan.nextInt();
	profile.setMonth(month);
	System.out.println("enter day of birth");
	int day = scan.nextInt();
	profile.setDay(day);
	System.out.println("enter currentYear");
	int currentYear = scan.nextInt();
	scan.close();
	
	profile.age(currentYear);
	System.out.println("my firstName is: "+profile.getFirstName());
	System.out.println("my lastName is: "+profile.getLastName());
	profile.maximumHeart(26);
	profile.heartRate(34);
	profile.bmi();	
	System.out.println("gender : "+gender);
	System.out.println("height:" + height);
	}

}
