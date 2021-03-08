package com.meritamerica.assignment2;

public class BankAccount
{
	public BankAccount(
			double balance, double interestRate
	)
	{
		this.balance = 0;
		if( balance > 0 )
			this.deposit( balance );

		this.interestRate = interestRate;
	}

	public BankAccount(
			long accountNumber, double balance, double interestRate
	)
	{
		this( balance, interestRate );
		this.accountNumber = accountNumber;
	}

	public BankAccount()
	{

	}

	public long getAccountNumber()
	{
		return this.accountNumber;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public double getInterestRate()
	{
		return this.interestRate;
	}

	public boolean withdraw(
			double amount
	)
	{
		double balanceAfterWidthdrawal = this.balance - amount;
		if( amount >= 0 && balanceAfterWidthdrawal >= 0 )
		{
			balance = balanceAfterWidthdrawal;
			return true;
		}

		return false;
	}

	public boolean deposit(
			double amount
	)
	{
		if( amount > 0 )
		{
			balance += amount;
			return true;
		}

		return false;
	}

	public double futureValue(
			int years
	)
	{
		return this.balance * Math.pow( 1 + this.interestRate, years );
	}

	private double interestRate;
	private double balance;
	private long accountNumber;
}
