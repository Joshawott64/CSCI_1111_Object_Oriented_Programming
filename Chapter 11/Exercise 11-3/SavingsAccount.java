import java.util.Date;
public class SavingsAccount extends Account {
	// Default constructor
	public SavingsAccount() {
	}
	
	public SavingsAccount(int id, double balance, double annualInterestRate, 
			Date dateCreated) {
		setId(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
		setDateCreated(dateCreated);
	}
	
	// Returns string description of savings account
	public String toString(int id, double balance, double annualInterestRate, 
			Date dateCreated) {
		String balanceF = String.format("%.2f", balance);
		String monthlyInterestF = String.format("%.2f", Account.getMonthlyInterest());
		return "Balance: $" + balanceF + "  Monthly Interest: $" + 
				monthlyInterestF + "  " + dateCreated;
	}
	
}
