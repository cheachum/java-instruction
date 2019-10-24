package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator");
		
		CheckingAccount ca = new CheckingAccount(1000,1);
		SavingsAccount sa = new SavingsAccount(1000,.01);
		
		System.out.println("Starting Balances: ");
		displayBalances(ca, sa);
		System.out.println("Enter transactions for the month");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String txn = Console.getString("Withdraw or Deposit: ");
			String account = Console.getString("Checking or Savings?");
			double amount = Console.getDouble("Amount?", 0, Double.POSITIVE_INFINITY);
			
			Account a = null; 
			if (account.equalsIgnoreCase("c")) {
				a = ca;
			}
			else if (account.equalsIgnoreCase("s"))
			{ a = sa; }
			
			else { 
				System.out.println( "Invalid account type");
			continue; 
			}
			if(txn.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			}
			else if (txn.equalsIgnoreCase("d")) {
				a.deposit(amount);
			}
			else {
				System.out.println("Invalid txn.");
				continue;
			}
			
			
			choice = Console.getString("Continue?");
		}
		
		ca.subtractMonthlyFeeFromBalance();
		sa.applyPaymentToBalance();
		System.out.println("Monthly Payments and Fees: ");
		System.out.println("Checking Fee: "+ca.getMonthlyFee());
		System.out.println("Savings Interest Payment: "+sa.getMonthlyInterestPayment());
		
		
		
		System.out.println("Final Balances: ");
		displayBalances(ca, sa);
		
		System.out.println("Bye!");
	}
	
	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("Checking: "+cf.format(ca.getBalance()));
		System.out.println("Savings: "+cf.format(sa.getBalance()));
	}
}
