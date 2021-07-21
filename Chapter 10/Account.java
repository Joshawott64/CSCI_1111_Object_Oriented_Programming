/*
 * Author: Joshua Gray
 * Date: 7/20/21
 * 
 * This program uses the Account class to simulate an ATM machine by 
 * showing user data once the correct id is entered.
 */
import java.util.Date;
import java.util.Scanner;
public class Account {

	public static void main(String[] args) {
		// Set up scanner
		Scanner input = new Scanner(System.in);
		// Construct 10 accounts
		Account account[] = new Account[10];
		account[0] = new Account(0, 100, 4.5, dateCreated);
		account[1] = new Account(1, 100, 2.3, dateCreated);
		account[2] = new Account(2, 100, 5.6, dateCreated);
		account[3] = new Account(3, 100, 1.0, dateCreated);
		account[4] = new Account(4, 100, 3.7, dateCreated);
		account[5] = new Account(5, 100, 4.2, dateCreated);
		account[6] = new Account(6, 100, 3.3, dateCreated);
		account[7] = new Account(7, 100, 1.5, dateCreated);
		account[8] = new Account(8, 100, 4.9, dateCreated);
		account[9] = new Account(9, 100, 6.6, dateCreated);
		
		// Infinite loop so that system never stops
		for (int i = 1; i > 0;) {
			
			// Prompt user to enter id
			System.out.print("Enter an id: ");
			int userId = input.nextInt();
			
			
			while (userId != account[userId].id) {
				System.out.println("Invalid id");
				System.out.println();
				System.out.print("Enter an id: ");
				userId = input.nextInt();
			}
			
			// Main menu
			int choice = 0;
			while (choice != 4) {
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				System.out.println();
				System.out.print("Enter a choice: ");
				choice = input.nextInt();
				
				if (choice == 1) {
					System.out.println("The balance is " + account[userId].balance);
				}
				else if (choice == 2) {
					System.out.println();
					System.out.print("Enter an amount to withdraw: ");
					double withdrawAmount = input.nextDouble();
					double afterWithdrawal = account[userId].withdrawal(withdrawAmount);
					account[userId].balance = afterWithdrawal;
				}
				else if (choice == 3) {
					System.out.println();
					System.out.print("Enter an amount to deposit: ");
					double depositAmount = input.nextDouble();
					double afterDeposit = account[userId].deposit(depositAmount);
					account[userId].balance = afterDeposit;
				}
				else if (choice == 4) {
					System.out.println("Have a nice day");
					System.out.println();
				}
				else {
					System.out.println("Please enter a valid choice");
				}
			}

		}

	}
	
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
	private double balance;
	private double annualInterestRate;
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
	
	// Return the monthly interest rate
	double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	// Return the monthly interest
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	// Return balance after withdrawal
	double withdrawal(double amount) {
		return balance - amount;
	}
	
	// Return balance after withdrawal
	double deposit(double amount) {
		return balance + amount;
	}

}
