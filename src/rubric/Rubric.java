package rubric;

import java.util.ArrayList;
import java.util.Collection;

public class Rubric
{
	private ArrayList<Contact> contacts;
	
	public Rubric() 
	{
		contacts = new ArrayList<Contact>();
	}
	
	public Rubric(Collection<Contact> collection) 
	{
		contacts = new ArrayList<Contact>(collection);
	}
	
	public boolean add(Contact contact)
	{
		return contacts.add(contact);
	}
	
	public Contact delete(Contact contact)
	{
		if(contacts.remove(contact))
			return contact;
		return null;
	}
	
	public Contact delete(String name, String surname)
	{
		
		for (Contact contact : contacts)
		{
			if(contact.getName() == name && contact.getSurname() == surname)
				if(contacts.remove(contact))
					return contact;
		}
		return null;
	}

	public String print()
	{
		String printedOutputString = "";
		for(Contact contact : contacts)
		{
			printedOutputString += contact.getName() + " " + contact.getSurname() + " " + contact.getNumber() + "\n";
		}
		return printedOutputString;
	}
}
