package exercises;

public class ModifiedAccountTest {

	public static void main(String[] args) {
		ModifiedAccount account1 = new ModifiedAccount("peter", 20.00);
		ModifiedAccount account2 = new ModifiedAccount("paul", -2.53);

        displayAccount(account1);
        displayAccount(account2);
        System.out.print("");
               
        account1.deposit(500.00);
        displayAccount(account1);

        account2.deposit(0.00);
        displayAccount(account2);

        account1.withdraw(400.00);
        displayAccount(account1);

        account2.withdraw(300.00);
        displayAccount(account2);
         

    }
    
    public static void displayAccount(ModifiedAccount accountToDisplay){
        System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(),accountToDisplay.getBalance());
    }
        


	}


