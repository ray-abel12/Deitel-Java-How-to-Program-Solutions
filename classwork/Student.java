package exercises;

public class Student {
	//variable declarations
private int id;
private String name;
private String gender;
//public char[]grades;


//create two constructor
public Student(int id,String name,String gender) {
	this.id = id;
	this.name = name;
	this.gender = gender;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

//method declarations
boolean updateProfile(String newName) {
	this.name = newName ;
	return true;
}

}
