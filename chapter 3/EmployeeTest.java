package exercises;

public class EmployeeTest {

	public static void main(String[] args) {
	
		Employee employee1 = new Employee("chris "," idris ", 2000.32);
		Employee employee2 = new Employee("root "," doh ", -200);
		
		System.out.printf("%s%s%f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary());
		System.out.printf("%s%s%f%n",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary());
		
		System.out.printf("%s%s%f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getSalary()*10);
		System.out.printf("%s%s%f",employee2.getFirstName(),employee2.getLastName(),employee2.getSalary()*10);
	}

}
