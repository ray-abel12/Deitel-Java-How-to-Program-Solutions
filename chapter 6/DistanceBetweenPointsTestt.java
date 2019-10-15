package exercises;

import java.util.Scanner;

public class DistanceBetweenPointsTestt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter x2");
		double x2 = scan.nextDouble();
		
		System.out.println("enter x1");
		double x1 = scan.nextDouble();
		
		System.out.println("enter y1");
		double y1 = scan.nextDouble();
		
		System.out.println("enter y2");
		double y2 = scan.nextDouble();
		
		DistanceBetweenPoints.DistanceBetweenPoint(x2, x1, y2, y1);
		scan.close();
	}

}
