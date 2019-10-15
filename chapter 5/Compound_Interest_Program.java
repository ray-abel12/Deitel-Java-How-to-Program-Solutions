package exercise;

public class Compound_Interest_Program {
	
	private double principal = 1000;
	private double rate = 0.05;
	
  public void interest() {
  System.out.printf("%s%20s%n", "Year", "Amount on deposit");
  
  for (int year = 1; year <= 10; ++year) {
	    double amount = principal * Math.pow(1.0 + rate, year);
	System.out.printf("%4d%,20.2f%n", year, amount);
}
  }
}
