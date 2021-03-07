package com.meritamerica.assignment2;

public class MeritAmericaBankApp
{
	public static void main(
			String[] args
	)
	{ // i:
		CDOffering[] cdos = new CDOffering[ 5 ];
		cdos[ 0 ] = new CDOffering( 1, 1.8 );
		cdos[ 1 ] = new CDOffering( 2, 1.9 );
		cdos[ 2 ] = new CDOffering( 3, 2 );
		cdos[ 3 ] = new CDOffering( 5, 2.5 );
		cdos[ 4 ] = new CDOffering( 10, 2.2 );
		MeritBank.setCDOfferings( cdos );

		// ii:
		AccountHolder ah1 = new AccountHolder( "John", "M", "Doe", "123" );

		// iii:
		ah1.addCheckingAccount( 1000 );
		ah1.addSavingsAccount( 10000 );
		
		// iv:
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount( 50000 );
		
		//v:
		ah1.addCheckingAccount(50000);
		ah1.addSavingsAccount( 500000);
		
		//vi:
		ah1.addCheckingAccount(5000);
		ah1.addSavingsAccount( 50000 );
		//////////////////////
		System.out.println( ah1.toString() );
		
		

	}
}