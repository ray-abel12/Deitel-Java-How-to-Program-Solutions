package exercises;



	import java.util.Scanner;

	public class AccountTest {

	public static void main(String args[]) {
	Account account1 = new Account(103); 
	Account account2 = new Account(0); 

	System.out.printf("%f%n", account1.getBalance());
	System.out.printf("%f%n", account2.getBalance());

	Scanner input = new Scanner(System.in);
	double depositAmount; 

	System.out.print("Enter deposit amount for account1: "); 
	depositAmount = input.nextDouble();
	System.out.printf("adding %.2f to account1 balance", depositAmount);
	account1.credit(depositAmount); 

	System.out.printf("account1 balance: $%.2f%n", account1.getBalance());
	System.out.printf("account2 balance: $%.2f%n", account2.getBalance());


	System.out.print("Enter deposit amount for account2: "); //prompt
	depositAmount = input.nextDouble(); 
	System.out.printf("adding %.2f to account2 balance", depositAmount);
	account2.credit(depositAmount); 

	System.out.printf("account1 balance: $%.2fn", account1.getBalance());
	System.out.printf("account2 balance: $%.2fn", account2.getBalance());

	double withdrawalAmount;
	System.out.print("Enter withdrawal amount for account1: "); // prompt
	withdrawalAmount = input.nextDouble();
	System.out.printf("subtracting %.2f from account1 balance", withdrawalAmount);
	account1.debit(withdrawalAmount);

	System.out.printf("account1 balance: $%.2fn", account1.getBalance());
	System.out.printf("account2 balance: $%.2fn", account2.getBalance());

	System.out.print("Enter withdrawal amount for account2: "); // prompt
	withdrawalAmount = input.nextDouble();
	System.out.printf("subtracting %.2f from account2 balance", withdrawalAmount);
	account2.debit(withdrawalAmount);

	System.out.printf("account1 balance: $%.2fn", account1.getBalance());
	System.out.printf("account2 balance: $%.2fn", account2.getBalance());
	input.close();
	} 

	

	}

