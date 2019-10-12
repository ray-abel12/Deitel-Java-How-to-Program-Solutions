package exercises;

public class HealthProfile {

	public String firstName;
	public String lastName;
	public String gender;
	public int month;
	public int day;
	public int year;
	public int height;
	public int weight;
	
	public HealthProfile(String firstName, String lastName, String gender, int month, int day, int year, int height,
			int weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.month = month;
		this.day = day;
		this.year = year;
		this.height = height;
		this.weight = weight;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
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
	public int bmi() {
		int bmi = weight * 703/height * height;
		System.out.println("bmi is "+bmi);
		return bmi;
	}
	
}
