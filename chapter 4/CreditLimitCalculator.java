package exercise;


	public class CreditLimitCalculator {
		private double accountNo;
		private double beginningBalance;
		private double chargedMonthly;
		private double creditLimit;
		private double creditApplied;
		private double newBalance;
		
		public CreditLimitCalculator(double accountNo,double beginningBalance,double chargedMonthly,double creditLimit,double creditApplied) {
			
			this.accountNo = accountNo;
			this.beginningBalance = beginningBalance;
			this.chargedMonthly = chargedMonthly;
			this.creditLimit = creditLimit;
			this.creditApplied = creditApplied;

	}
		public double getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int accountNo) {
			this.accountNo = accountNo;
		}
		public double getBeginningBalance() {
			return beginningBalance;
		}
		public void setBeginningBalance(int beginningBalance) {
			this.beginningBalance = beginningBalance;
		}
		public double getChargedMonthly() {
			return chargedMonthly;
		}
		public void setChargedMonthly(int chargedMonthly) {
			this.chargedMonthly = chargedMonthly;
		}
		public double getCreditLimit() {
			return creditLimit;
		}
		public void setCreditLimit(int creditLimit){
			this.creditLimit = creditLimit;
		}
		public double getCreditApplied() {
			return creditApplied;
		}
		public void setCreditApplied(int creditApplied) {
			this.creditApplied = creditApplied;
		}
		public double newBalance() {
			newBalance = beginningBalance + chargedMonthly - creditLimit;
			if(newBalance > creditLimit) {
				System.out.println("Credit limit exceeded");
			}else {
				
			}
			return newBalance;
			
		}
	}

