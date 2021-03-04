package com.meritamerica.assignment2;

public class MeritBank
{
	private static CDOffering[] cdos;

	private static long accountNumberNext = 1000000;

	static void addAccountHolder(
			AccountHolder accountHolder
	)
	{
	}

	static AccountHolder[] getAccountHolders()
	{
		return new AccountHolder[ 0 ];
	}

	static CDOffering[] getCDOfferings()
	{
		return new CDOffering[ 0 ];
	}

	static CDOffering getBestCDOffering(
			double depositAmount
	)
	{
		return cdos[ 0 ];
	}

	static CDOffering getSecondBestCDOffering(
			double depositAmount
	)
	{
		return cdos[ 0 ];
	}

	static void clearCDOfferings()
	{
	}

	static void setCDOfferings(
			CDOffering[] offerings
	)
	{
		cdos = offerings;
	}

	static long getNextAccountNumber()
	{
		return accountNumberNext++ ;
	}

	static double totalBalances()
	{
		return 0;
	}

	static double futureValue(
			double presentValue,
			double interestRate,
			int term
	)
	{
		return 0;
	}
}
