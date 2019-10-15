package exercises;

import java.util.Scanner;

public class QualityPoints {

	public void qualitPoints() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("please enter value A,B and C max score is 50");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int total = num1 + num2 + num3 / 3;
		//System.out.println(total);
		
		if((total > 90) && (total < 100)){
			System.out.println("point of value is: 4");
		}else
			
		if((total > 80) && (total < 89)){
			System.out.println("point of value is: 3");
		
		}else
			
		if((total > 70) && (total < 79)){
			System.out.println("point of value is: 2");
		
		}else
			
		if((total > 60) && (total < 69)){
			System.out.println("point of value is: 1");
		
		}else
			
		if((total > 60) && (total < 0)){
			System.out.println("point of value is: 0");
		
		}else {
			System.out.println("point error");
		}
		scan.close();
	}
}
