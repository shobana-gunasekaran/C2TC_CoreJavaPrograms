package com.tnsif.dayfourteen.synchronization;
//Program to demonstrate User Defined Exception class
public class DepositLimitExceedException extends Exception {

	public DepositLimitExceedException()
	{
		super("Daily limit of Deposit is exceeded..");
	}
	public DepositLimitExceedException(String message)
	{
		super(message);
	}
}