package exercises;

public class Date {
	public int month;
	public int day;
	public int year;
	
public Date(int month,int day,int year) {
	this.month = month;
	this.day = day;
	this.year = year;
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
public void displayDate() {
	//getMonth()/ getDay() / getYear();
	System.out.println(getMonth()+"/"+ getDay()+"/"  +getYear());
	//return displayDate();
}
}
