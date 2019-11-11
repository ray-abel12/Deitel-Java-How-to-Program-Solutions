package exercises;

public enum BookGenre1 {
	BIOGRAPY (12),
	HORROR   (15),
	ACTION   (17);
	
	private int minAgeToRead;
	
	private BookGenre1(int minAgeToRead) {
		this.minAgeToRead = minAgeToRead;
	}
	public int minAgeToRead() {
		return minAgeToRead;
	}
	public static void main(String[] args) {
 for(BookGenre1 bookgenre : BookGenre1.values()) {
	System.out.println(bookgenre.minAgeToRead()) ;
 }
	}
}
