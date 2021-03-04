package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder 
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String SSN;
	
	
	AccountHolder() 
	{
		this.nameFirst = new String();
		this.nameMiddle = new String();
		this.nameLast = new String();
		this.SSN = new String();
	}

	AccountHolder(String firstName, String middleName, 
			String lastName, String SSN)
	{
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		setSSN (SSN);
	}
	
	public String getFirstName() {
		return this.nameFirst;
	}
	
	private void setFirstName(String firstName) {
		this.nameFirst = firstName;
		
	}
	
	public String getMiddleName() {
		return this.nameFirst;
	}
	
	private void setMiddleName(String middleName) {
		this.nameMiddle = middleName;
		
	}
	
	public String getLastName() {
		return this.nameLast;
	}
	
	private void setLastName(String lastName) {
		this.nameLast = lastName;
		
	}
	
	public String getSSN() {
		return this.SSN;
	}
	
	private void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public String toString() {
	
	StringBuilder s = new StringBuilder();
	
	s.append( "Name: " + this.getFirstName() + " " 
	+ this.getMiddleName() + " " 
	+ this.getLastName() + " "
	+ this.getSSN() );
	
	return s.toString();
	}	
}