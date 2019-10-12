package exercises;

public class Employee {
	
	public String firstName;
	public String lastName;
	public double salary;
	
public Employee(String firstName,String lastName,double salary) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	if (salary > 0) {
		this.salary = salary;
	}else {
		System.out.println("error salary is in negative value");
	}
	
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

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {

		this.salary = salary;

	
	
}

}
