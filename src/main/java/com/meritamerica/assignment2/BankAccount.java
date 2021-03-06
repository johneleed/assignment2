package com.meritamerica.assignment2;

public class BankAccount {
	private double interestRate;
	private double balance;
	
	public BankAccount(double balance, double interestRate) {
	}

	

	public BankAccount(long accountNumber, double balance, double interestRate) {
	}

	public BankAccount() {

	}

	public long getAccountNumber() {
		return MeritBank.getNextAccountNumber();
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public boolean withdraw(double amount) {
		return false;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
		balance += amount;
		return true;
		}
		return false;
	}

	public double futureValue(int years) {
		return 0;
	}
}
