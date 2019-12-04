package exercises;

public class StudentTest {

	public static void main(String[] args) {
		//array for student id
		int[] studentIds = new int[] {1001,1002,1003};
		
		//creating a new student object
		Student student1 = new Student(studentIds[0], "qbel","male");
		//setting student state 
		//student1.gender = "male";
		
		//creating a new student object
		Student student2 = new Student(studentIds[1], "peter","male");
		//setting student state 
		//student2.gender = "male";
		
		//creating a new student object
		Student student3 = new Student(studentIds[2], "angie","female");
		//setting student state 
		//student3.gender = "female";
		
		//print name with correct name 
		System.out.println("the name of student1: "+ student1.getName());
		System.out.println("the name of student2: "+ student2.getName());
		System.out.println("the name of student3: "+ student3.getName());
		
		//attempt to update name from method
		student1.setName("abel");
		
		//updating profile with correct name 
		System.out.println("the name of student1: "+ student1.getName());
		System.out.println("the number of obj: "+ Student.getStudentCount());
		
		
	}

}
