package exercise;

import java.util.Scanner;

public class Enforcing_PrivacyTest {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	Enforcing_Privacy privacy = new Enforcing_Privacy();
	System.out.println("enter 5 values");
	int input = scan.nextInt();
	privacy.passValue(input);
	scan.close();
	
	
	}

}
