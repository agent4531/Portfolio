package module2;

import java.util.Arrays;
import java.util.Scanner;

public class CreateLoans {
	
	
	
	public static void main(String[] args) {
		
		Loan[] allLoans;
		allLoans = new Loan[5];
		allLoans[0] = new BusinessLoan();
		allLoans[1] = new BusinessLoan();
		allLoans[2] = new BusinessLoan();
		allLoans[3] = new BusinessLoan();
		allLoans[4] = new BusinessLoan();
		
		double prime;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("What is the Prime Rate?");
		prime = scanner.nextDouble();
		Loan loan1 = new BusinessLoan(1, "Tatavitto", 1, 10, 3);
		Loan loan2 = new BusinessLoan(1, "Tatavitto", 1, 10, 3);
		Loan loan3 = new BusinessLoan(3, "Pan", 3, 5, 7);
		
		if(loan1.equals(loan2)) {
			System.out.println("These are equal!");
		}else {
			System.out.println("These are NOT equal!");
		}
		
		if(loan1.equals(loan3)) {
			System.out.println("These are equal!");
		}else {
			System.out.println("These are NOT equal!");
		}
		
		Loan loan4 = new PersonalLoan(1, "Tatavitto", 1, 10, 3);
		Loan loan5 = new PersonalLoan(1, "Tatavitto", 1, 10, 3);
		Loan loan6 = new PersonalLoan(3, "Pan", 3, 5, 7);

		if(loan4.equals(loan6)) {
			System.out.println("These are equal!");
		}else {
			System.out.println("These are NOT equal!");
		}
		
		if(loan4.equals(loan5)) {
			System.out.println("These are equal!");
		}else {
			System.out.println("These are NOT equal!");
		}
		
		int i = 0;
		
		while (i < 5) {
			allLoans[i].setPrime(prime);
			allLoans[i] = allLoans[i].stats();
			i++;
		}
		System.out.println(Arrays.toString(allLoans));

	}

}
