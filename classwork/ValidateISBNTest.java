package pratical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {

		@Test
		void checkAValidate10DigitISBN() {
		  ValidateISBN validator = new ValidateISBN();
		 boolean result = validator.checkISBN("0140449116");
		 assertTrue(result);
		 result = validator.checkISBN("0140177396");
		 assertTrue(result);
		}
		
		@Test
		void checkAValidate13DigitISBNNumber() {
			 ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("9781853260087");
			 assertTrue(result); 
			 result = validator.checkISBN("9781853267338");
			 assertTrue(result);
		}
		
		@Test
		void tenDigitISBNNumberEndingInXAreValid() {
			ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("012000030X");
			 assertTrue(result);
		}
		
		@Test
		void checkAnInvalid10DigitISBN() {
			  ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("0140449115");
			 //fail();
			 assertFalse(result);
			}
		@Test
		void checkAnInvalid13DigitISBN() {
			  ValidateISBN validator = new ValidateISBN();
			 boolean result = validator.checkISBN("9781853267338");
			 assertFalse(result);
			}
		
		@Test()
		void NineDigitISBNAreNotAllowed() {
			  ValidateISBN validator = new ValidateISBN();
			assertThrows(NumberFormatException.class, ()-> validator.checkISBN("140449115"));
//			 assertFalse(result);
			}
		
         @Test()
         void nonNumericISBNAreNotAllowed() {
        	ValidateISBN validator = new ValidateISBN();
        	assertThrows(NumberFormatException.class,()-> validator.checkISBN("hello world"));
        	//validator.checkISBN("hello world");
         }
	}
	


