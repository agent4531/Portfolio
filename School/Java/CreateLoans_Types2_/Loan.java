package module2;

import java.util.Scanner;

abstract class Loan implements LoanConstants {
	
	Scanner scanner = new Scanner(System.in);
	int loantype;
	int i;
	
	int loanNumber;
	String nameL;
	int loanAmount;
	int term;
	
	double intrestRate;
	double primeRate;
	
	public Loan stats() {
		
		System.out.println("What is the Loan Number?");
		setLoanNumber();
		System.out.println("What is the Last Name?");
		setLastName();
		System.out.println("What is the Loan Amount?");
		setLoanAmount();
		System.out.println("What is the Loan Term?(3/7/15)");
		setTerm();
		return loanType();
	}
	public void setPrime(double prime) {
		primeRate = prime;
	}
	public Loan loanType() {
		Loan newLoan = new BusinessLoan();
		System.out.println("Are you creating a business loan (1) or a personal loan (2)");
		loantype = scanner.nextInt();
		scanner.nextLine();//remove endline
		if (loantype == 1) {
			i = 1;
			System.out.println("You created a business loan");
			newLoan= new BusinessLoan(loanNumber, nameL, loanAmount, primeRate, term);
			
		}else if (loantype == 2) {
			i = 2;
			System.out.println("You created a personal loan");
			newLoan = new PersonalLoan(loanNumber, nameL, loanAmount, primeRate, term);
		}else {
			System.out.println("that is invalid try again");
			loanType();
		}
		return newLoan;
	}
	public void setLoanNumber() {
		loanNumber = scanner.nextInt();
		scanner.nextLine();//remove endline
	}
	public void setLastName() {
		nameL = scanner.nextLine();
	}
	public void setLoanAmount() {
		 loanAmount = scanner.nextInt();
		 scanner.nextLine();//remove endline
		 if (loanAmount > 50000) {
			 // if the loan amount is above 50 k max then it will ask again for teh loan amount
			 System.out.println("Sorry thats amount is to much try again!");
			 System.out.println("What is the Loan Amount?");
			 setLoanAmount();
		 }
	}
	public void setTerm() {
		term = scanner.nextInt();
		scanner.nextLine();//remove endline
		switch (term) {
			case 3:
				term = 3;
				break;
			case 7:
				term = 7;
				break;
			case 15:
				term = 15;
				break;
			default:
				term = 3;
				break;
		}
		
	}
	public int getLoanNumber() {
		return loanNumber;
	}
	public String getLastName() {
		return nameL;
	}
	public int getLoanAmount() {
		 return loanAmount;
	}
	public int getTerm() {
		return term;
	}
}
