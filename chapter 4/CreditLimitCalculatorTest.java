package exercise;

public class CreditLimitCalculatorTest {

		public static void main(String[] args) {
			
		CreditLimitCalculator obj1 = new CreditLimitCalculator(12345, 2002, 500, 5000, 1000);
		CreditLimitCalculator obj2 = new CreditLimitCalculator(123333, 2000, 1000,1000, 0);
		System.out.println(obj1.newBalance());
		System.out.println(obj2.newBalance());
		}
}