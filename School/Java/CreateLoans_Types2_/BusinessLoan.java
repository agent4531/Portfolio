package module2;

public class BusinessLoan extends Loan {
	
	public BusinessLoan(int loanN, String last, int loanA, double prime, int termN) {
		loanNumber = loanN;
		nameL = last;
		loanAmount = loanA;
		intrestRate = 3.2 + prime;
		term = termN;
	}
	
	public BusinessLoan() {//blank to initialize  a "Loan" Var
		loanNumber = 0;
		nameL = "Invalid";
		loanAmount = 0;
		intrestRate = 3.2 + 0;
		term = 0; // term set to 0 to show invalid input
	}
	public double getIntrestRate(){
		return intrestRate;
	}
	
	public String toString(){
		String result;
		result = "This is a Business Loan and the loan number is: " + loanNumber + " for the last name of: " + nameL + " \n\twith an amount of: $" + loanAmount + " at a rate of: " + intrestRate + "% for " + term + " years\n";
		return result;
	}
	public boolean equals(Object obj) {
		
		if(!(obj instanceof BusinessLoan)) {
			return false;
		}
				
		boolean result = false;
		
		if(this.getLoanNumber() == ((BusinessLoan)obj).getLoanNumber() && this.getLastName() == ((BusinessLoan)obj).getLastName() && this.getLoanAmount() == ((BusinessLoan)obj).getLoanAmount() && this.getTerm() == ((BusinessLoan)obj).getTerm()) {
			result = true; // Checks Loan Number | Last Name | Loan Amount | Term and if all are equal then set .equals to true
		}
		
		return result;
	}
	
}
