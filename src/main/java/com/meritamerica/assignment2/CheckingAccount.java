package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount
{
	private long accountNumber;

	CheckingAccount(
			double openingBalance
	)
	{
		this.deposit( openingBalance );
		this.accountNumber = this.getAccountNumber();
	}

	public double getInterestRate()
	{
		return 0.0001;
	}
}