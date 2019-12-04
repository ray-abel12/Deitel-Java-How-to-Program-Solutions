package exercises;

public class Immuntability {

	public static void main(String[] args) {
	/*
		// string object is created
		String s1 = new String("abcd");
		s1 = new String("1234");
		System.out.println(s1);
		*/
		String s = "hello " + "world";
		System.out.println(s);
		String s1 = "hello " + "world" + 125 ;
		System.out.println(s1);
		//no addition because the values are in the back 
		s1 = "hello " + "world" + 125 + 255.54;
		System.out.println(s1);
		//added because the numeric values are in the front 
		s1 = 125 + 255.54 + "hello"+"word";
		System.out.println(s1);
	}

}
