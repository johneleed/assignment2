package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount
{
	private long accountNumber;

	SavingsAccount()
	{
	}

	SavingsAccount(
			double openingBalance
	)
	{
		this.deposit( openingBalance );
		this.accountNumber = this.getAccountNumber();
	}

	public double getInterestRate()
	{
		return 1 / 100;
	}
}