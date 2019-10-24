package ch03_prj3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Intereset Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println("Enter loan amount: ");
		BigDecimal loanAmount = sc.nextBigDecimal();
		
		System.out.println("Enter interest rate: ");
		BigDecimal interestRate =sc.nextBigDecimal();
		
		// biz logic -- compute loan amount and interest rate 
		interestRate = interestRate.add(new BigDecimal("1"));
		loanAmount = loanAmount.multiply(interestRate);
		
		
		
		
		
		System.out.println("Continue");
		choice = sc.next();
		
		}
		
		System.out.println("Bye!");

	}

}
