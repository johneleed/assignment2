package com.meritamerica.assignment2;

public class CheckingAccount extends BankAccount
{
	CheckingAccount(
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

	private static final double INTEREST_RATE = 0.01 / 100;
}