package pratical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

		@Test
		void validateISBN() {
		  ValidateISBN validator = new ValidateISBN();
		 boolean result = validator.checkISBN("0140449116");
		 assertTrue(result);
		 result = validator.checkISBN("0140177396");
		 assertTrue(result);
		}
		
		@Test
		void checkAnInvalidISBN() {
			  ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("0140449115");
			 //fail();
			 assertFalse(result);
			}
		@Test()
		void NineDigitISBNAreNotAllowed() {
			  ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("0140449115");
			 assertFalse(result);
			}

	}
	


