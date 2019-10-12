package exercises;

public class Target_Heart_Rate_Calculator {
	
	public String firstName;
	public String lastName;
	public int day;
	public int month;
	public int year;
	public Target_Heart_Rate_Calculator(String firstName, String lastName, int day, int month, int year) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int age(int currentYear) {
		int age = currentYear - getYear() ;
		System.out.println("age is: " +age);
		return age ;
	}
	public int maximumHeart(int age) {
		int heart = 220 - age;
		System.out.println("maximumheart rate is: "+heart);
		return heart;
	}
	public void heartRate (int heart) {
	int	rate = heart * 100 /50;
	System.out.println("heart rate is: "+ rate);
	}
}
