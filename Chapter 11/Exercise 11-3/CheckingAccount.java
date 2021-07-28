import java.util.Date;
public class CheckingAccount extends Account {
	// Data fields
	private double overdraft;
	
	// Default constructor
	public CheckingAccount() {
	}
	
	public CheckingAccount(double overdraft, int id, double balance, 
			double annualInterestRate, Date dateCreated) {
		this.overdraft = overdraft;
		setId(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
		setDateCreated(dateCreated);
	}
	
	/* Returns overdraft limit
	 * (Overdraft limit is always 110% of account balance)
	 */
	public double overdraftLimit(double overdraft, double balance) {
		return overdraft = balance * 1.1;
	}
	
	// Returns string description of checking account
		public String toString(int id, double balance, double annualInterestRate, 
				Date dateCreated) {
			String balanceF = String.format("%.2f", balance);
			String monthlyInterestF = String.format("%.2f", Account.getMonthlyInterest());
			String overdraftLimitF = String.format("%.2f", overdraftLimit(overdraft, balance));
			return "Balance: $" + balanceF + "  Monthly Interest: $" + 
					monthlyInterestF + "  Overdraft Limit: $" 
					+ overdraftLimitF + "  " 
					+ dateCreated;
		}
}
