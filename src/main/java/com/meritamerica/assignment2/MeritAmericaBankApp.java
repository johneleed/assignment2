package com.meritamerica.assignment2;

public class MeritAmericaBankApp
{
	public static void main(
			String[] args
	)
	{ // i:
		// Add 5 CDOfferings to MeritBank
		CDOffering[] cdos = new CDOffering[ 5 ];
		cdos[ 0 ] = new CDOffering( 1, 1.8 / 100 );
		cdos[ 1 ] = new CDOffering( 2, 1.9 / 100 );
		cdos[ 2 ] = new CDOffering( 3, 2 / 100 );
		cdos[ 3 ] = new CDOffering( 5, 2.5 / 100 );
		cdos[ 4 ] = new CDOffering( 10, 2.2 / 100 );
		MeritBank.setCDOfferings( cdos );

		// ii:
		// Instantiate a new AccountHolder (ah1)
		AccountHolder ah1 = new AccountHolder( "John", "M", "Doe", "ssn1" );

		// iii:
		// Add a checking account with an opening balance of $1,000 as well as a savings
		// account with an opening balance of $10,000 to ah1
		ah1.addCheckingAccount( 1000 );
		ah1.addSavingsAccount( 1e4 );

		// iv:
		// Add a checking account with an opening balance of $5,000 as well as a savings
		// account with an opening balance of $50,000 to ah1
		ah1.addCheckingAccount( 5000 );
		ah1.addSavingsAccount( 5e4 );

		// v:
		// Add a checking account with an opening balance of $50,000 as well as a
		// savings account with an opening balance of $500,000 to ah1
		ah1.addCheckingAccount( 5e4 );
		ah1.addSavingsAccount( 5e5 );

		// vi:
		// Add a checking account with an opening balance of $5,000 as well as a savings
		// account with an opening balance of $50,000 to ah1
		ah1.addCheckingAccount( 5000 );
		ah1.addSavingsAccount( 5e4 );

		// vii:
		// Confirm last checking and savings accounts were not created
		System.out.println( ah1.toString() );

		// viii:
		// Add the best CD offering as a CD account on ah1
		CDOffering cdoBest = MeritBank.getBestCDOffering( 1 );
		if( cdoBest != null )
		{
			CDAccount cdaBest = new CDAccount( cdoBest, 10000 );
			ah1.addCDAccount( cdaBest );
		}

		// ix:
		// Add ah1 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder( ah1 );

		// x:
		// Instantiate a new AccountHolder (ah2)
		AccountHolder ah2 = new AccountHolder( "Second", "Account", "Holder", "ssn2" );

		// xi:
		// Add a checking account with an opening balance of $1,000 as well as a savings
		// account with an opening balance of $10,000 to ah2
		ah2.addCheckingAccount( 1e3 );
		ah2.addSavingsAccount( 1e4 );

		// xii:
		// Add the second best CD offering as a CD account on ah2
		CDOffering cdoSecond = MeritBank.getSecondBestCDOffering( 1 );
		if( cdoSecond != null )
			ah2.addCDAccount( new CDAccount( cdoSecond, 2e5 ) );

		// xiii:
		// Add ah2 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder( ah2 );

		// xiv:
		// Clear the CDs being offered by MeritBank
		MeritBank.clearCDOfferings();

		// xv:
		// Instantiate a new AccountHolder (ah3)
		AccountHolder ah3 = new AccountHolder( "Third", "Account", "Holder", "ssn3" );

		// xvi:
		// Add the second best CD offering as a CD account on ah3
		System.out.println( ah3.toString() );
		cdoSecond = MeritBank.getSecondBestCDOffering( 1 );
		if( cdoSecond != null )
			ah3.addCDAccount( new CDAccount( cdoSecond, 3e5 ) );

		// xvii:
		// Confirm a CD account was not created on ah3
		System.out.println( ah3.toString() );

		// xviii:
		// Add a checking account with an opening balance of $1,000 as well as a savings
		// account with an opening balance of $10,000 to ah3
		ah3.addCheckingAccount( 1e3 );
		ah3.addSavingsAccount( 1e4 );

		// xix:
		// Add ah3 to Merit Bank’s list of account holders
		MeritBank.addAccountHolder( ah3 );

		// xx:
		// Get the total balance of all accounts held by Merit Bank’s account holders
		double total = 0;
		for( AccountHolder ah: MeritBank.getAccountHolders() )
		{
			total += ah.getCombinedBalance();
			if( ah.getNumberOfCDAccounts() > 0 )
				for( CDAccount cda: ah.getCDAccounts() )
					total += cda.getBalance();
		}

		System.out.println( "Total balance of all Merit Bank accountholders: " + total );
//		System.out.println( ah1.toString() );
//		System.out.println( ah2.toString() );
//		System.out.println( ah3.toString() );
	}
}