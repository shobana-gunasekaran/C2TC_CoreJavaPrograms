package com.tnsif.dayeleven.v1;
//Program to demonstrate Multiple catch block

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchDemo {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while (true) {
			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
				//break;
			} catch (InputMismatchException e) {
				// e.printStackTrace();
				System.out.println("Invalid input. Please enter integers only.");
				sc.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("Exception caught: " + e.getMessage());
				//break;
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				//break;
			}
		}
		//sc.close();
	}
}