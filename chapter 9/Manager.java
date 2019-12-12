package exercises;

public class Manager extends Employee {
	private String department;
	Manager(String n, int s,String d){
	// when you call a constructor for the super class u have u use super to access it constructor too
		super(n,s);
		this.department = d;
	}
	public String getDepartment() {
		return department;
	}
}
