package com.dev.assesment;

public interface ContactInterface {
	
	public void displayALLContacts();
	public boolean addContact(String key,Contacts c);
	public Contacts getContact(String key);
	public boolean editContact(String key);
	public void remove(String key);
}
