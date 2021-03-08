package com.meritamerica.assignment2;

public class CDAccount extends BankAccount
{
	public CDAccount(
			CDOffering offering, double balance
	)
	{
		super( MeritBank.getNextAccountNumber(), balance, offering.getInterestRate() );
		this.offering = offering;
	}

//	public CDAccount()
//	{ // Remove this?
//	}

	public double getBalance()
	{
		return super.getBalance();
	}

	public double getInterestRate()
	{
		return super.getInterestRate();
	}

	public int getTerm()
	{
		return this.offering.getTerm();
	}

	public java.util.Date getStartDate()
	{
		return dateStart;
	}

	public long getAccountNumber()
	{
		return super.getAccountNumber();
	}

	public double futureValue()
	{
		return super.futureValue( this.getTerm() );
	}

	private CDOffering offering;

	private java.util.Date dateStart;
}