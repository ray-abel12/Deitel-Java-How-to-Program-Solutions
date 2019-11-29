package exercises;

public class ConstructorTest {
public String name;
public int age;
public int id;
 
//public ConstructorTest() {
//	System.out.println("no parameter supplied");
//}
//public ConstructorTest(String name) {
	//this.name = name;
//}
public ConstructorTest(String name,int age) {
	this.name = name;
	this.age = age;

}
public ConstructorTest(String name,int age,int id) {
	this(name,age);
	this.id = id;
	
}
	public static void main(String[] args) {
	
		
		ConstructorTest con3 = new ConstructorTest("abel",15,45);
		System.out.println("name: "+ con3.name);
		System.out.println("age: "+ con3.age);
		System.out.println("id: "+ con3.id);
		

	}

}
