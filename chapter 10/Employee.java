package exercise;


public class Employee {
	private String name;
	protected int salary;
	
protected Employee(String n,int s){
	this.name = n;
	this.salary = s;
}

	public String getName() {
	return name;
}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return String.format("Name %s%n%s%n%d",name,"salary:",salary);
	}
}

