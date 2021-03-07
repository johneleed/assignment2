package com.meritamerica.assignment2;

public class AccountHolder
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String SSN;
	private CheckingAccount[] checkingAccounts;
	private SavingsAccount[] savingsAccounts;

	AccountHolder()
	{
		this.nameFirst = new String();
		this.nameMiddle = new String();
		this.nameLast = new String();
		this.SSN = new String();
	}

	AccountHolder(
			String firstName, String middleName, String lastName, String SSN
	)
	{
		setFirstName( firstName );
		setMiddleName( middleName );
		setLastName( lastName );
		setSSN( SSN );
	}

	public String getFirstName()
	{
		return this.nameFirst;
	}

	private void setFirstName(
			String firstName
	)
	{
		this.nameFirst = firstName;
	}

	public String getMiddleName()
	{
		return this.nameMiddle;
	}

	private void setMiddleName(
			String middleName
	)
	{
		this.nameMiddle = middleName;
	}

	public String getLastName()
	{
		return this.nameLast;
	}

	private void setLastName(
			String lastName
	)
	{
		this.nameLast = lastName;
	}

	public String getSSN()
	{
		return this.SSN;
	}

	private void setSSN(
			String SSN
	)
	{
		this.SSN = SSN;
	}

	public CheckingAccount addCheckingAccount(
			double openingBalance
	)
	{ // New Checking Account (nca):
		CheckingAccount nca = null;
		if( getCombinedBalance() <= MeritBank.ACCOUNT_BALANCES_MAX )
		{
			nca = new CheckingAccount( openingBalance );
			_addCheckingAccount( nca );
		}

		return nca;
	}

	public CheckingAccount addCheckingAccount(
			CheckingAccount checkingAccount
	)
	{
		if( getCombinedBalance() <= MeritBank.ACCOUNT_BALANCES_MAX )
			_addCheckingAccount( checkingAccount );

		return checkingAccount;
	}

	private void _addCheckingAccount(
			CheckingAccount checkingAccount2add
	)
	{
		if( this.getNumberOfCheckingAccounts() < 1 )
		{
			checkingAccounts = new CheckingAccount[ 1 ];
			checkingAccounts[ 0 ] = checkingAccount2add;
		}
		else
			checkingAccounts = MeritBank.accountAddOne( checkingAccounts, checkingAccount2add );
	}

	public static CheckingAccount[] increaseArrayby1(
			CheckingAccount[] source,
			CheckingAccount nca
	)
	{
		CheckingAccount[] destination = new CheckingAccount[ source.length + 1 ];
		System.arraycopy( source, 0, destination, 0, source.length );
		destination[ source.length ] = nca;
		return destination;
	}


	public CheckingAccount[] getCheckingAccounts()
	{
		return this.checkingAccounts;
	}

	public int getNumberOfCheckingAccounts()
	{
		int count = 0;
		if( checkingAccounts != null )
			count = checkingAccounts.length;

		return count;
	}

	public double getCheckingBalance()
	{
		double total = 0;
		if( this.getNumberOfCheckingAccounts() > 0 )
			for( int x = 0; x < checkingAccounts.length; x++ )
				total += checkingAccounts[ x ].getBalance();

		return total;
	}

	public SavingsAccount addSavingsAccount(
			double openingBalance
	)
	{
		SavingsAccount nsa = null;
		if( getCombinedBalance() <= MeritBank.ACCOUNT_BALANCES_MAX )

		{
			nsa = new SavingsAccount( openingBalance );
			if( savingsAccounts == null )
			{
				savingsAccounts = new SavingsAccount[ 1 ];
				savingsAccounts[ 0 ] = nsa;
			}
			else
			{
				savingsAccounts = MeritBank.increaseArrayBy1( savingsAccounts, nsa );
			}
		}

		return nsa;
	}

	public SavingsAccount addSavingsAccount(
			SavingsAccount savingsAccount
	)
	{
		return new SavingsAccount();
	}

	public SavingsAccount[] getSavingsAccounts()
	{
		return new SavingsAccount[ 1 ];
	}

	public int getNumberOfSavingsAccounts()
	{
		return 0;
	}

	public double getSavingsBalance()
	{
		return 0;
	}

	public CDAccount addCDAccount(
			CDOffering offering,
			double openingBalance
	)
	{
		return new CDAccount();
	}

	public CDAccount addCDAccount(
			CDAccount cdAccount
	)
	{
		return new CDAccount();
	}

	public CDAccount[] getCDAccounts()
	{
		return new CDAccount[ 0 ];
	}

	public int getNumberOfCDAccounts()
	{
		return 0;
	}

	public double getCDBalance()
	{
		return 0;
	}

	public double getCombinedBalance()
	{
		double balances = 0;
		balances += this.getCheckingBalance();

		if( savingsAccounts != null )
			for( int x = 0; x < savingsAccounts.length; x++ )
				balances += savingsAccounts[ x ].getBalance();

		return balances;
	}

//	public double getAccountBalances()
//	{
//		double total = 0;
//		if( checkingAccounts != null )
//			for( int x = 0; x < checkingAccounts.length; x++ )
//				total += checkingAccounts[ x ].getBalance();
//		
//		if( savingsAccounts != null )
//			for( int x = 0; x < savingsAccounts.length; x++ )
//				total += savingsAccounts[ x ].getBalance();
//		return total;
//	}
	
	public String toString()
	{

		StringBuilder s = new StringBuilder();

		s.append( "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + " " + this.getSSN() );
		s.append( "\n\tchecking" );
		if( checkingAccounts != null )

			for( int i = 0; i < checkingAccounts.length; i++ )
			{
				s.append( "\n\t\t" + checkingAccounts[ i ].getAccountNumber() );
				s.append( "\n\t\t\t" + checkingAccounts[ i ].getBalance() );
			}

		s.append( "\n\tsavings" );
		if( savingsAccounts != null )
			for( int i = 0; i < savingsAccounts.length; i++ )
			{
				s.append( "\n\t\t" + savingsAccounts[ i ].getAccountNumber() );
				s.append( "\n\t\t\t" + savingsAccounts[ i ].getBalance() );
			}
		return s.toString();
	}
}