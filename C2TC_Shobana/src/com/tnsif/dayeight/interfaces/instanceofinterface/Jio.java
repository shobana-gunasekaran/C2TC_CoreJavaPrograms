package com.tnsif.dayeight.interfaces.instanceofinterface;

//Program to define concrete class that implements the Phone interface.

public class Jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}