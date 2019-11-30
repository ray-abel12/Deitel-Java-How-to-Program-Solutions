package exercises;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer();
		
		buff.append("hello");
		buff.append("world");
		//printout the concatenated in string
		System.out.println("buff.toString: "+ buff.toString());
		//get the length of the concatenated string
		System.out.println("Length: "+ buff.length());
		//delete values from 1 to 5,i inclusive,5 exclusive
		buff.delete(1,5);
		//at index 1 insert hell
		buff.insert(1,"hell");
	}

}
