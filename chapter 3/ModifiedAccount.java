package exercises;

public class ModifiedAccount {
    private String name;  //instance 
    private double balance;

    public ModifiedAccount(String name, double balance){  //constructor name is class name
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public double withdraw(double withdrawAmount) {
    	if(withdrawAmount > balance) {
    		System.out.print("Amount exceeded balance");
    	}
    	if(withdrawAmount <= balance) {
    		balance = balance - withdrawAmount;
    	}
    	return balance;
    } 
    
}

