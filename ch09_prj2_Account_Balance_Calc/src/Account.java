
public abstract class Account implements Depositable, Withdrawable, Balanceable {
	public double balance;
	
	public Account() {
		super();
	}
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	

}
