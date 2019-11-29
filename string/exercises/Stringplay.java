package exercises;

public class Stringplay {

	public static void main(String[] args) {
		String s = " hello-world";
	/*	
	//check the string length
		System.out.println("string length is : " + s.length());
	//check if the string is empty
		System.out.println("s.isEmpty "+ s.isEmpty());*/
		
	//	comparison
		/*
		//equals check both no and case
		System.out.println("s.equals: "+ s.equals("hello-world"));
		//equalsIgnorCase will ignore the case 
		System.out.println("s.equalsIgnoreCase: "+ s.equalsIgnoreCase("Hello-world"));
		System.out.println("s.compareTo: "+ s.compareTo("hello-world"));
		*/
	//searching
		/*
		System.out.println("s.cointains: " +s.contains("world"));
		System.out.println("s.cointains: " +s.contains("hello"));
		System.out.println("s.startWith: " +s.startsWith("Hello"));
		System.out.println("s.endsWith: " +s.endsWith("d"));
		System.out.println("s.indexOf: " +s.indexOf("lo"));
		System.out.println("s.lastIndexOf: " +s.lastIndexOf("o"));
		*/
		
		/*
		//examining individual character
		System.out.println("charAt: "+ s.charAt(2));
		
		//Extracting substrings
		// the 2 where it start and 3 where it stops
		System.out.println("substring: " + s.substring(2,3));
		*/
		/*
		//case conversion
		//string is immutable it only returns a copy it does not alter it .
		System.out.println("toUpperCase: " + s.toUpperCase());
		System.out.println("toLowerCase: " + s.toLowerCase());
		//remove the whit space either at the beginning or end 
		System.out.println("trim: " + s.trim());
		*/
		
		//first one it will use to locate and the following change to
		//System.out.println("replaceAll: "+ s.replaceAll("o","b"));
		
		//split
		System.out.println("split:  using o");
		String[] sa = s.split("o");
		for(String i:sa) {
			System.out.println(i);
		}
	}

}
