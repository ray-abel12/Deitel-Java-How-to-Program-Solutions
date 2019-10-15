package exercise;

import java.util.Random;

public class Bar_Chart_Printing {

	public static void main(String[] args) {
		
		
		
		int j = 0;
		while(j <= 5) {
			Random random = new Random ();
			int total = 1 + random.nextInt(30);
			
		for(int i = 0;i < total; i++) {
			System.out.print("*");
			
		}
		System.out.println();
		j++;
	}
	}

}
