package exercises;

public class ManagerTest2 {

	public static void main(String[] args) {
		Employee employ = new Employee("smith",1000);
		Manager manage = new Manager("peter",12000,"It");
		System.out.println(employ.toString());
		System.out.println(manage.toString());

	}

}
