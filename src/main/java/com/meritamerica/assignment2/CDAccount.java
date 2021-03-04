package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount
{
	public CDAccount(
			CDOffering offering, double balance
	)
	{
	}

	public CDAccount()
	{	//	Remove this?
	}

	public double getBalance()
	{
		return 0;
	}

	public double getInterestRate()
	{
		return 0;
	}

	public int getTerm()
	{
		return 0;
	}

	public java.util.Date getStartDate()
	{
		return new Date();
	}

	public long getAccountNumber()
	{
		return 0;
	}

	public double futureValue()
	{
		return 0;
	}
}