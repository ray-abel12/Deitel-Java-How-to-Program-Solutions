package exercises;

public class Account {

private double balance; 

public Account(double initBalance)
{
if(initBalance > 0.0)
balance=initBalance;
} 
public void credit(double amount)
{
balance=balance+amount; 
} 

public void debit(double amount)
{
if (amount > balance){
System.out.println("Withdrawal amount exceeded account balance.");

}else{
	balance=balance-amount;	

}

}

public double getBalance()
{
return balance; 
} 
} 


