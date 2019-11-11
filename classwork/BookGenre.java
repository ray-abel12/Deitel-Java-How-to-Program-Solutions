package exercises;

public enum BookGenre {
	BIOGRAPY , HORROR, ACTION;
	
	public static void main(String[] args) {
		for(BookGenre bookGenre : BookGenre.values()) {
			//System.out.print("\n Name: "+bookGenre);
		//	System.out.println(bookGenre.name());
			System.out.print("\n compare: "+bookGenre.compareTo(BookGenre.ACTION));
			System.out.print("\n equals: "+bookGenre.equals(BookGenre.ACTION));
		}
	}
}
