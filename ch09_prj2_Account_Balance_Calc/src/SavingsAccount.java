
public class SavingsAccount extends Account {
	public double monthlyIrate;
	public double monthlyIpayment;
	

	public SavingsAccount() {
		super();
	}
	

	public SavingsAccount(double monthlyIrate) {
		super();
		this.monthlyIrate = monthlyIrate;
	}



	@Override
	public void deposit(double deposit) {
		balance = balance + deposit;
		
	}

	@Override
	public void withdraw(double withdraw) {
		balance = balance - withdraw; 
	
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	
	public void addMonthlyIpayment() {
		balance = balance + (monthlyIpayment);
		
	}
	
	public double getMonthlyIpayment() {
		return monthlyIpayment;
		}
	}

