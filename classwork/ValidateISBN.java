package pratical;

public class ValidateISBN {

	public boolean checkISBN(String isbn) {
		if (isbn.length() !=10)throw new NumberFormatException("Isbn number must be 10 digit long");
		int total = 0;
		for(int i = 0;i < 10;i++) {
		total += isbn.charAt(i) * (10 -i);
		}
		if(total % 11 ==0 ) {
			return true;
		}
		return false;
	}

}
