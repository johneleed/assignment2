package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount
{
	SavingsAccount()
	{
	}

	SavingsAccount(
			double openingBalance
	)
	{
		super( MeritBank.getNextAccountNumber(), openingBalance, INTEREST_RATE
		);
	}

	public double getInterestRate()
	{
		return INTEREST_RATE;
	}

	private static final double INTEREST_RATE = 1 / 100;
}