package exercises;

import java.util.Scanner;

public class play {
	
	public static boolean check(int b,int a) 
	{
		if (a == b) {
			return true;
	}
	return false;
}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
	 if(check(b,a)== true) {
		 System.out.println("print true you win");
	 }else {
		 System.out.println("lie,fuck off");
	 }
		scan.close(); 
	 }

	}


