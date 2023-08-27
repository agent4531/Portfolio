package module2;

public class PersonalLoan extends Loan {

	public PersonalLoan(int loanN, String last, int loanA, double prime, int termN) {
		loanNumber = loanN;
		nameL = last;
		loanAmount = loanA;
		intrestRate = 2.7 + prime;
		term = termN;
	}
	
	public double getIntrestRate(){
		return intrestRate;
	}
	
	public String toString(){
		String result;
		result = "This is a Personal Loan and the loan number is: " + loanNumber + " for the last name of: " + nameL + " \n\twith an amount of: $" + loanAmount + " at a rate of: " + intrestRate + "% for " + term + " years\n";
		return result;
	}
	
	public boolean equals(Object obj) {
		
		if(!(obj instanceof PersonalLoan)) {
			return false;
		}
				
		boolean result = false;
		
		if(this.getLoanNumber() == ((PersonalLoan)obj).getLoanNumber() && this.getLastName() == ((PersonalLoan)obj).getLastName() && this.getLoanAmount() == ((PersonalLoan)obj).getLoanAmount() && this.getTerm() == ((PersonalLoan)obj).getTerm()) {
			result = true; // Checks Loan Number | Last Name | Loan Amount | Term and if all are equal then set .equals to true
		}
		
		return result;
	}

}
