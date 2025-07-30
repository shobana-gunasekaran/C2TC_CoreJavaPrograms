//Program to demonstrate creating objects
package day4.firstpackage;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String args[]) {
		person p1 = new person(); // default constructor invoked

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// p1.personName=name private member can't accessible
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		p1 = new person(name, age, city); // parameterized constructor invoked);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();

	}
}