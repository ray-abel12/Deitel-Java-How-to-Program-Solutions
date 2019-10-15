package exercises;

public class MathsClass {

	public static void main(String[] args) {
		
			double x1 = Math.abs(7.5);
			double x2 = Math.floor(7.5);
			double x3 = Math.abs(0.0);
			double x4 = Math.ceil(0.0);
			double x5 = Math.abs(-6.4);
			double x6 = Math.ceil(-6.4);
			double x7= Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
			System.out.printf("x1   %.2f\nx2   %.2f\nx3   %.2f\nx4   %.2f\nx5   %.2f\nx6   %.2f\nx7   %.2f\n", x1, x2, x3, x4, x5, x6, x7);

		}

	}


