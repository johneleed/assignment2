package com.meritamerica.assignment2;

public class MeritBank
{
	static AccountHolder accountHolders[];

	static void addAccountHolder(
			AccountHolder accountHolder
	)
	{
		if( accountHolder == null )
		{
			accountHolders = new AccountHolder[ 1 ];
			accountHolders[0] = accountHolder;
		}
		else
		{
			
		}
	}

	static AccountHolder[] getAccountHolders()
	{
		return accountHolders;
	}

	static CDOffering[] getCDOfferings()
	{
		return cdos;
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
		cdos = null;
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

//	static double totalBalances()
//	{
//		double balances = 0;
//		if( checkingAccounts != null )
//			for( int x = 0; x < checkingAccounts.length; x++ )
//				balances += checkingAccounts[ x ].getBalance();
//		if( savingsAccounts != null )
//			for( int x = 0; x < savingsAccounts.length; x++ )
//				balances += savingsAccounts[ x ].getBalance();
//
//		return balances;
//	}

	static double futureValue(
			double presentValue,
			double interestRate,
			int term
	)
	{
		return 0;
	}

	public static CheckingAccount[] accountAddOne(
			CheckingAccount[] source,
			CheckingAccount nca
	)
	{
		CheckingAccount[] destination = new CheckingAccount[ source.length + 1 ];
		System.arraycopy( source, 0, destination, 0, source.length );
		destination[ source.length ] = nca;
		return destination;
	}
	
	public static final int ACCOUNT_BALANCES_MAX = 250000;

	private static CDOffering[] cdos;

	private static long accountNumberNext = 1000000;
}
