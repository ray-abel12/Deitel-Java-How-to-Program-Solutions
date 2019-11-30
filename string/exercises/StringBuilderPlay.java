package exercises;

public class StringBuilderPlay {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("word");
		String s = sb.append("Good").append("morning").toString();
		System.out.println(s.toString());
	

	}

}
