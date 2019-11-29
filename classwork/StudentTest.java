package exercises;

public class StudentTest {

	public static void main(String[] args) {
		//array for student id
		int[] studentIds = new int[] {1001,1002,1003};
		
		//creating a new student object
		Student student1 = new Student(studentIds[0], "qbel");
		//setting student state 
		student1.gender = "male";
		
		//creating a new student object
		Student student2 = new Student(studentIds[1], "peter");
		//setting student state 
		student2.gender = "male";
		
		//creating a new student object
		Student student3 = new Student(studentIds[2], "angie");
		//setting student state 
		student3.gender = "female";
		
		//print name with correct name 
		System.out.println("the name of student1: "+ student1.name);
		System.out.println("the name of student2: "+ student2.name);
		System.out.println("the name of student3: "+ student3.name);
		
		//attempt to update name from method
		student1.updateProfile("abel");
		
		//updating profile with correct name 
		System.out.println("the name of student1: "+ student1.name);
		
		//reference practice
		student3 = student1;
		student3.updateProfile("pe");
		student3.gender = "female";
		student1.gender = "transgender";
		System.out.println("the name in student 4 is: "+student3.name);
		System.out.println("the name in student 4 is: "+student3.gender);
	}

}
