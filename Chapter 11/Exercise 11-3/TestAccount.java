/*
 * Author: Joshua Gray
 * Date: 7/28/21
 * 
 * This program utilizes superclasses and subclasses to simulate savings 
 * and checking accounts in a bank. CheckingAccount and SavingsAccount 
 * are subclasses of Account. TestAccount is the client program.
 */
public class TestAccount {

	public static void main(String[] args) {
		// Create savings account
		SavingsAccount savings1 = new SavingsAccount(0, 15000, 4.5, SavingsAccount.getDateCreated());
		
		// Created checking account
		CheckingAccount checking1 = new CheckingAccount(0, 1, 4000, 3.1, CheckingAccount.getDateCreated());
		
		// Output savings account
		System.out.println("Savings account: " + savings1.toString(savings1.getId(), savings1.getBalance(), 
				savings1.getAnnualInterestRate(), Account.getDateCreated()));
		System.out.println();

		// Output checking account
		System.out.println("Checking account: " + checking1.toString(checking1.getId(), checking1.getBalance(), 
				checking1.getAnnualInterestRate(), Account.getDateCreated()));
	}

}
