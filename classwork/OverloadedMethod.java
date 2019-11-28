package exercises;

public class OverloadedMethod {

	public void integer(int a,int b) {
		int value = a + b;
		System.out.println(value);
	}
	public void integer(double a, double b) {
		double value = a + b ;
		System.out.println("float number");
		System.out.println(value);
	}
	public static void main(String[] args) {
		OverloadedMethod over = new OverloadedMethod();
		over.integer(2.5,5.5);

	}

}
