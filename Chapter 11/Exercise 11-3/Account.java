import java.util.Date;
public class Account {
	// Construct default account
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	// Construct with specified id and initial balance
	Account(int newId, double newBalance, double newAnnualInterestRate, Date newDateCreated) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = newDateCreated;
	}
	
	// Data fields
	private int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated = new Date();
	
	// Return id (accessor)
	public int getId() {
		return id;
	}
	
	// Set a new id (mutator)
	public void setId(int newId) {
		id = (newId >= 0) ? newId : 0;
	}
	
	// Return balance (accessor)
	public double getBalance() {
		return balance;
	}
	
	// Get a new balance (mutator)
	public void setBalance(double newBalance) {
		balance = (newBalance >= 0) ? newBalance : 0;
	}
	
	// Return annualInterestRate (accessor)
	double getAnnualInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	// Set a new annualInterestRate (mutator)
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = (newAnnualInterestRate >= 0) ? newAnnualInterestRate : 0;
	}
	
	// Return dateCreated (accessor)
	static Date getDateCreated() {
		return dateCreated;
	}
	
	// Get a new date (mutator)
	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}
	
	// Return the monthly interest rate
	static double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	// Return the monthly interest
	static double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	// Return balance after withdrawal
	static double withdrawal(double amount) {
		return balance - amount;
	}
	
	// Return balance after withdrawal
	static double deposit(double amount) {
		return balance + amount;
	}

}
