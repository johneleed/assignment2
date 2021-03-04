package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder 
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String ssn;
	
	
	AccountHolder() 
	{
		this.nameFirst = new String();
		this.nameMiddle = new String();
		this.nameLast = new String();
		this.ssn = new String();
	}

	AccountHolder(String firstName, String middleName, String lastName)
	{
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
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
	
	public String toString() {
	
	StringBuilder s = new StringBuilder();
	s.append( "Name: " + this.getFirstName() + " " 
	+ this.getMiddleName() + " " 
	+ this.getLastName() );
	return s.toString();
	}	
}