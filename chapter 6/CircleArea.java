package exercises;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
	
		
				Scanner input = new Scanner(System.in);
				int value = 0;
				
				System.out.println("enter radius of circle");
				value = input.nextInt();
				
				double area = Math.PI * (value * value);
				System.out.printf("%.2f",area);
				
				input.close();
				
			}

	}

