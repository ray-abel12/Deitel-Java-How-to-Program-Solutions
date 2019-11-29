package exercises;

public class Student {
	//variable declarations
public int id;
public String name;
public String gender = "male";
//public char[]grades;

//create two constructor
public Student(int newId,String newName) {
	this(newName);
	this.id = newId;
	//this.grades = grades;
	
}
public Student(String newName) {
	this.name = newName;
	//System.out.println(newGender);
}

//method declarations
boolean updateProfile(String newName) {
	this.name = newName ;
	return true;
}

}
