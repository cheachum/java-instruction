
public class CheckingAccount extends Account {
	public double monthlyFee;


	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double monthlyFee, double balance) {
		super();
		this.monthlyFee = monthlyFee;
		this.balance = balance; 
	}

	@Override
	public void deposit(double amount) {
		balance = balance + amount; 
		
	}

	@Override
	public void withdraw(double amount) {
		balance = balance - amount; 
		
	}

	@Override
	public double getBalance() {
		balance = getBalance(); 
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance; 	
		
		
	}
	
	public void subtractMonthlyFee() {
		balance = balance-(monthlyFee); 
		
		
	}
	
	

}
