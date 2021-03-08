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
		return MeritBank.futureValue( this.getBalance(), this.getInterestRate(), years );
	}

	private double interestRate;

//	public void setInterestRate(
//			double interestRate
//	)
//	{
//		this.interestRate = interestRate;
//	}
//
//	public void setBalance(
//			double balance
//	)
//	{
//		this.balance = balance;
//	}
	
//	public void setAccountNumber(
//			long accountNumber
//			)
//	{
//		this.accountNumber = accountNumber;
//	}

	private double balance;
	private long accountNumber;
}
