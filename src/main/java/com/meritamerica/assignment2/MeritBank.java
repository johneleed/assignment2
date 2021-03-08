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
			accountHolders[ 0 ] = accountHolder;
		}
		else
		{
			accountHolders = accountAddOne( accountHolders, accountHolder );
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
		double valueBest = 0;

		double tempValue;

		byte indexBest = 0;

		for( byte b = 0; b < cdos.length; b++ )
		{
			tempValue = futureValue( depositAmount, cdos[ b ].getInterestRate(), cdos[ b ].getTerm() );
//			System.out.println( cdos[ b ].getInterestRate() + ", " + cdos[ b ].getTerm() + ", " + tempValue );
			if( tempValue > valueBest )
			{
				valueBest = tempValue;
				indexBest = b;
			}
		}

//		System.out.println( indexBest );
		return cdos[ indexBest ];
	}

	static double futureValue(
			double presentValue,
			double interestRate,
			int term
	)
	{
		return presentValue * Math.pow( 1 + interestRate, term );
	}

	static CDOffering getSecondBestCDOffering(
			double depositAmount
	)
	{
		double valueBest = 0; // , valueSecond = 0

		double tempValue;

		byte indexBest = 0, indexSecond = 0;

		for( byte b = 0; b < cdos.length; b++ )
		{
			tempValue = futureValue( 10000, cdos[ b ].getInterestRate(), cdos[ b ].getTerm() );
//			System.out.println( cdos[ b ].getInterestRate() + ", " + cdos[ b ].getTerm() + ", " + tempValue );
			if( tempValue > valueBest )
			{
				// valueSecond = valueBest;
				indexSecond = indexBest;
				valueBest = tempValue;
				indexBest = b;
			}
		}

//		System.out.println( indexSecond );
		return cdos[ indexSecond ];
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

	public static SavingsAccount[] increaseArrayBy1(
			SavingsAccount[] source,
			SavingsAccount nsa
	)
	{
		SavingsAccount[] destination = new SavingsAccount[ source.length + 1 ];
		System.arraycopy( source, 0, destination, 0, source.length );
		destination[ source.length ] = nsa;
		return destination;
	}

	public static CDAccount[] increaseArrayBy1(
			CDAccount[] source,
			CDAccount ncda
	)
	{ // New CD Account (ncda):
		CDAccount[] destination = new CDAccount[ source.length + 1 ];
		System.arraycopy( source, 0, destination, 0, source.length );
		destination[ source.length ] = ncda;
		return destination;
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

	public static AccountHolder[] accountAddOne(
			AccountHolder[] source,
			AccountHolder nah
	)
	{
		AccountHolder[] destination = new AccountHolder[ source.length + 1 ];
		System.arraycopy( source, 0, destination, 0, source.length );
		destination[ source.length ] = nah;
		return destination;
	}

	public static final int ACCOUNT_BALANCES_MAX = 250000;

	private static CDOffering[] cdos;

	private static long accountNumberNext = 1000000;
}
