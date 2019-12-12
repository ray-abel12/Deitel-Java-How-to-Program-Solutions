package exercises;

public class ManagerTest {

	public static void main(String[] args) {
		Employee employ = new Employee("john",2000);
		System.out.println(employ.getName()+":"+employ.getSalary());
		Manager manage = new Manager("johner",7000,"sales");
		System.out.println(manage.getName());
		System.out.println(manage.getSalary());
		System.out.println(manage.getDepartment());
	}

}
