package com.tnsif.dayfour.inheritance;

public class Student extends person {

	private int sid;
	private String dept;
	
	void show() {
		System.out.println("In Student class");
	}
	
	void display() {
		System.out.println("In person class");
	}
}
