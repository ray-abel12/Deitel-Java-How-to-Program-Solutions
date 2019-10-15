package exercises;

import java.util.Scanner;

public class TemperatureConversionsTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter fah");
		int fah = scan.nextInt();
		TemperatureConversions.celsius(fah);
		
		System.out.println("enter cel");
		int cel = scan.nextInt();
		TemperatureConversions.fahrenheit(cel);
		scan.close();

	}

}
