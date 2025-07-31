package com.tnsif.dayeight.interfaces.extendinginterfaces;

//multiple inheritance - 

public class ExtendingInterface implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}