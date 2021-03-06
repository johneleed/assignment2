package com.meritamerica.assignment2;

public class BankAccount {
	private double interestRate;

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
		return 0;
	}

	public double getInterestRate() {
		return 0;
	}

	public boolean withdraw(double amount) {
		return false;
	}

	public boolean deposit(double amount) {
		return false;
	}

	public double futureValue(int years) {
		return 0;
	}
}
