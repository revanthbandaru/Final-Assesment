package com.dev.assesment;

import java.util.HashMap;
import java.util.Scanner;

public class ContactList implements ContactInterface{
	
	static Scanner sca = new Scanner(System.in);
	
	HashMap<String,Contacts> hm =new HashMap<String,Contacts>();
	HashMap<String,Contacts> hm1 =new HashMap<String,Contacts>();

	@Override
	public void displayALLContacts() {
		System.out.println(hm1);
		
	}

	@Override
	public boolean addContact(String key, Contacts c) {
		if(key!=null) {
			hm1.put(key, c);
			return true;
		}
		return false;
	}

	@Override
	public Contacts getContact(String key) {
		return hm1.get(key);
	}

	@Override
	public boolean editContact(String key) {
		if(key!=null) {
			hm1.containsKey(key);
			return true;
		}
		
		return false;
		
	}

	@Override
	public void remove(String key) {
	if(key!=null) {
		hm1.remove(key);
	}
	}
	
	

}
