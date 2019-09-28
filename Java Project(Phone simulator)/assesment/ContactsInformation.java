package com.dev.assesment;

import java.util.Scanner;

public class ContactsInformation {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("press 1 to show all the contacts");
		System.out.println("press 2 to search for Contacts");
		System.out.println("press 3 to Operate on Contacts");
		ContactList cl = new ContactList();

		Contacts c1 = new Contacts();

		c1.setGroup("college");
		c1.setName("Revanth");
		c1.setNumber(123456789);

		Contacts c2 = new Contacts();

		c2.setGroup("intermediate");
		c2.setName("Harish");
		c2.setNumber(1232346789);
		Contacts c3 = new Contacts();

		c3.setGroup("school");
		c3.setName("Bhanu");
		c3.setNumber(1113456789);
		Contacts c4 = new Contacts();

		c4.setGroup("home");
		c4.setName("Loknath");
		c4.setNumber(223456789);

		cl.addContact("Revanth", c1);

		cl.addContact("Harish", c2);
		cl.addContact("Bhanu", c3);
		cl.addContact("Loknath", c4);
		Contacts[] c = { c1, c2, c3, c4 };

		int n1 = scn.nextInt();
		switch (n1) {
		case 1:
			cl.displayALLContacts();
			break;
		case 2:
			System.out.println("enter the name of the Contact");
			String str = scn.next();
			for (int i = 0; i <= c.length - 1; i++) {
				
				if (str.equalsIgnoreCase(c[i].getName())) { 
					System.out.println("these are the details of the Contact:" + c[i].getGroup());
					System.out.println("" + c[i].getName());
					System.out.println("" + c[i].getNumber());
				
					System.out.println("press 1 to call");
					System.out.println("press 2 to message");
					System.out.println("press 3 to go back to Main menu");
			}
			}
					int n2 = scn.nextInt();
					if (n2 == 1) {
						System.out.println("Calling.......");

					} else if (n2 == 2) {
						System.out.println("enter your message");
						String msg = scn.nextLine();
						System.out.println("sending message.....");
					} else if (n2 == 3) {
						mainMenu();
						break;
						}
		case 3:
			int curd = mainMenu();
			if (curd == 1) {
				System.out.println("fill the details of Contact");
				System.out.println("Name:");
				String name = scn.next();

				Contacts c5 = new Contacts();
				c5.setName(name);
				System.out.println("enter number");
				long n4 = scn.nextLong();
				c5.setNumber(n4);
				cl.addContact("5", c5);
				System.out.println("contact added successfully");
				cl.displayALLContacts();
				return;

			} else if (curd == 2) {
				System.out.println("enter the name of the contact to delete");
				String sname = scn.next();
				cl.remove(sname);
				
				cl.displayALLContacts();
				System.out.println("deleted successfully1");
				return;
			} else if (curd == 3) {
				System.out.println("enter the contact name to be edited");
				String strname = scn.next();
				for (int j = 0; j <= c.length-1; j++) {
					if (strname.equalsIgnoreCase(c[j].getName())) {

						System.out.println("edit the name of selected contact");
						String s1 = scn.next();
						c[j].setName(s1);
						System.out.println("enter the name of the group");
						String s2 = scn.next();
						c[j].setGroup(s2);
						System.out.println("enter the mobile number");
						long s3 = scn.nextLong();
						c[j].setNumber(s3);
						System.out.println("edited successfully");
						cl.displayALLContacts();
					return;
					}

				}


			}
			
			System.out.println("press 0 to cancel call/msg");
			System.out.println("not found");
			int o = scn.nextInt();
			if(n1==2) {
			if (o == 0) {
				System.out.println("call ended");
			}
			}
			break;
		}
	}

	private static int mainMenu() {
		System.out.println("press 1 to add Contact");
		System.out.println("press 2 to delete Contact");
		System.out.println("press 3 to edit Contact");
		int n3 = scn.nextInt();
		return n3;

	}
}
