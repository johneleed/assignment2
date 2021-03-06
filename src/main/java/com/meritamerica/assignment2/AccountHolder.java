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
	{
		CheckingAccount nca = null;
		if( getAccountBalances() <= MeritBank.ACCOUNT_BALANCES_MAX )
		{
			nca = new CheckingAccount( openingBalance );
			if( checkingAccounts == null )
			{
				checkingAccounts = new CheckingAccount[ 1 ];
				checkingAccounts[ 0 ] = nca;
			}
			else
			{
				checkingAccounts = MeritBank.accountAddOne( checkingAccounts, nca );
			}
		}
		
		return nca;
	}

//	public static CheckingAccount[] accountAddOne(
//			CheckingAccount[] source,
//			CheckingAccount nca
//	)
//	{
//		CheckingAccount[] destination = new CheckingAccount[ source.length + 1 ];
//		System.arraycopy( source, 0, destination, 0, source.length );
//		destination[ source.length ] = nca;
//		return destination;
//	}
	
	public CheckingAccount addCheckingAccount(
			CheckingAccount checkingAccount
	)
	{
		return checkingAccount;
	}

	public double getAccountBalances()
	{
		double balances = 0;
		if( checkingAccounts != null )
		{
			for( int x = 0; x < checkingAccounts.length; x++ )
			{
				balances += checkingAccounts[ x ].getBalance();
			}
		}
		if( savingsAccounts != null )
		{
			for( int x = 0; x < savingsAccounts.length; x++ )
			{
				balances += savingsAccounts[ x ].getBalance();
			}
		}
		return balances;
	}

	public CheckingAccount[] getCheckingAccounts()
	{
		return new CheckingAccount[ 1 ];

	}

	public int getNumberOfCheckingAccounts()
	{
		return 0;
	}

	public double getCheckingBalance()
	{
		return 0;
	}

	public SavingsAccount addSavingsAccount(
			double openingBalance
	)
	{
		return new SavingsAccount();
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
		if( checkingAccounts != null )
			for( int x = 0; x < checkingAccounts.length; x++ )
				balances += checkingAccounts[ x ].getBalance();
		
		if( savingsAccounts != null )
			for( int x = 0; x < savingsAccounts.length; x++ )
				balances += savingsAccounts[ x ].getBalance();

		return balances;
	}

	public String toString()
	{

		StringBuilder s = new StringBuilder();

		s.append( "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + " " + this.getSSN() );

		return s.toString();
	}
}