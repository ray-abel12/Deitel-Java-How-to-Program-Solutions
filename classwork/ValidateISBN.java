package pratical;

public class ValidateISBN {

	public boolean checkISBN(String isbn) {
		if(isbn.length() == 13) {
			return isThisAValid13DigitISBN(isbn);
		}else {
		if (isbn.length() !=10)throw new NumberFormatException("Isbn number must be 10 digit long");
		int total = 0;
		for(int i = 0;i < 10;i++) {
			if(!Character.isDigit(isbn.charAt(i))) {
				if(i == 9 && isbn.charAt(i)=='X') {
					total +=10;
				}else {
				throw new NumberFormatException("must be digit");
			  }
			}else {
		total += Character.getNumericValue(isbn.charAt(i)) * (10 -i);
		}
		}
		if(total % 11 ==0 ) {
			return true;
		}
		}
		return false;
	}

	public boolean isThisAValid13DigitISBN(String isbn) {
		int total = 0;
		for(int i = 0; i < 13; i++) {
			if(i % 2 == 0) {
				total += Character.getNumericValue(isbn.charAt(i));
			}
			else {
				total += Character.getNumericValue(isbn.charAt(i)) * 3;
			}
		}
		if(total % 10 == 0 ) {
			return true;
		}else {
		
		return false;
		}
	}
	

}
