package exercise;

import java.util.Scanner;

public class ResultAnalysis {
	
	Scanner input = new Scanner(System.in);

public void count() {
	int studentCounter = 0;
	// process 10 students using counter-controlled loop
	while (studentCounter != -1)
	{
	// prompt user for input and obtain value from user
	System.out.print("Enter result (1 = pass, 2 = fail): ");
	int result = input.nextInt();
	System.out.print("Enter result -1 ");
	studentCounter = input.nextInt();


	int passes = 0;
	int failures = 0;
	int studentCounter1 = 1;
	// if...else is nested in the while statement
	if (result == 1)
	passes = passes + 1;
	else
	failures = failures + 1;
	studentCounter1 = studentCounter1 + 1;
	}
	input.close();
	}
}
