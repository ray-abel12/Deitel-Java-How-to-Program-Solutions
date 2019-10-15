package exercises;

public class TemperatureConversions {
	public static int celsius(int fah) {
		
		double celsius = 5.0 / 9.0 * (fah - 32);
		return (int)celsius;
	}
	public static int fahrenheit(int celsius) {
		double fahrenheit = 9.0 / 5.0 * celsius + 32;
		return (int)fahrenheit;
	}
}
