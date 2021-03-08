package com.meritamerica.assignment2;

public class AccountHolder
{
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
			accountsChecking = new CheckingAccount[ 1 ];
			accountsChecking[ 0 ] = checkingAccount2add;
		}
		else
			accountsChecking = MeritBank.accountAddOne( accountsChecking, checkingAccount2add );
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
		return this.accountsChecking;
	}

	public int getNumberOfCheckingAccounts()
	{
		int count = 0;
		if( accountsChecking != null )
			count = accountsChecking.length;

		return count;
	}

	public double getCheckingBalance()
	{
		double total = 0;
		if( this.getNumberOfCheckingAccounts() > 0 )
			for( int x = 0; x < accountsChecking.length; x++ )
				total += accountsChecking[ x ].getBalance();

		return total;
	}

	public SavingsAccount addSavingsAccount(
			double openingBalance
	)

	{ // New Savings Account (nsa):
		SavingsAccount nsa = null;
		if( getCombinedBalance() <= MeritBank.ACCOUNT_BALANCES_MAX )
		{
			nsa = new SavingsAccount( openingBalance );
			_addSavingsAccount( nsa );
		}

		return nsa;
	}

	public SavingsAccount addSavingsAccount(
			SavingsAccount savingsAccount
	)
	{
		if( getCombinedBalance() <= MeritBank.ACCOUNT_BALANCES_MAX )
			_addSavingsAccount( savingsAccount );

		return savingsAccount;
	}

	private void _addSavingsAccount(
			SavingsAccount savingsAccount2add
	)
	{
		if( this.getNumberOfSavingsAccounts() < 1 )
		{
			accountsSavings = new SavingsAccount[ 1 ];
			accountsSavings[ 0 ] = savingsAccount2add;
		}
		else
			accountsSavings = MeritBank.increaseArrayBy1( accountsSavings, savingsAccount2add );
	}

	public SavingsAccount[] getSavingsAccounts()
	{
		return this.accountsSavings;
	}

	public int getNumberOfSavingsAccounts()
	{
		int count = 0;
		if( accountsSavings != null )
			count = accountsSavings.length;

		return count;
	}

	public double getSavingsBalance()
	{
		double total = 0;
		if( this.getNumberOfSavingsAccounts() > 0 )
			for( int x = 0; x < accountsSavings.length; x++ )
				total += accountsSavings[ x ].getBalance();

		return total;
	}

	public CDAccount addCDAccount(
			CDOffering offering,
			double openingBalance
	)
	{ // New CD Account to add (ncda):
		CDAccount ncda = new CDAccount( offering, openingBalance );
		_addCDAccount( ncda );
		return ncda;
	}

	public CDAccount addCDAccount(
			CDAccount cdAccount
	)
	{
		_addCDAccount( cdAccount );
		return cdAccount;
	}

	private void _addCDAccount(
			CDAccount cdAccount2add
	)
	{
		if( accountsCD == null )
		{
			accountsCD = new CDAccount[ 1 ];
			accountsCD[ 0 ] = cdAccount2add;
		}
		else
			MeritBank.increaseArrayBy1( accountsCD, cdAccount2add );
	}

	public CDAccount[] getCDAccounts()
	{
		return this.accountsCD;
	}

	public int getNumberOfCDAccounts()
	{
		int count = 0;

		if( this.accountsCD != null )
			count = this.accountsCD.length;

		return count;
	}

	public double getCDBalance()
	{
		double total = 0;

		if( getNumberOfCDAccounts() > 0 )
			for( int x = 0; x < accountsCD.length; x++ )
				total += accountsCD[ x ].getBalance();

		return total;
	}

	public double getCombinedBalance()
	{
		return this.getCheckingBalance() + this.getSavingsBalance();
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder();

		s.append( "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + " " + this.getSSN() );
		s.append( "\n\tchecking" );
		if( accountsChecking != null )

			for( int i = 0; i < accountsChecking.length; i++ )
			{
				s.append( "\n\t\t" + accountsChecking[ i ].getAccountNumber() );
				s.append( "\n\t\t\t" + accountsChecking[ i ].getBalance() );
			}

		s.append( "\n\tsavings" );
		if( accountsSavings != null )
			for( int i = 0; i < accountsSavings.length; i++ )
			{
				s.append( "\n\t\t" + accountsSavings[ i ].getAccountNumber() );
				s.append( "\n\t\t\t" + accountsSavings[ i ].getBalance() );
			}
		return s.toString();
	}

	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String SSN;

	private CheckingAccount[] accountsChecking;
	private SavingsAccount[] accountsSavings;
	private CDAccount[] accountsCD;
}