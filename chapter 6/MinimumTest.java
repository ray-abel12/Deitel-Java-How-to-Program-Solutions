package exercises;

import java.util.Scanner;

public class MinimumTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter A");
		int a = scan.nextInt();
		
		System.out.println("enter B");
		int b = scan.nextInt();
		
		System.out.println("enter C");
		int c = scan.nextInt();
		
		Minimum.minimum(a, b, c);
         scan.close();
	}

}
