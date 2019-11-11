package rubric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 
 * Dichiarate una nuova classe RubricaOrdinata,
 * che sovrascrive il metodo add di Rubrica in maniera da mantenere i contatti ordinati per cognome, e se il cognome è identico per nome.
 * Usate RubricaOrdinata in ProvaRubrica (basta sostituire new Rubrica con new RubricaOrdinata).
 * 
 * */

public class SortedRubric extends Rubric
{
	private ArrayList<Contact> contacts;
	
	public SortedRubric()
	{
		contacts = new ArrayList<Contact>();
	}
	
	public SortedRubric(Collection<Contact> collection)
	{
		contacts = new ArrayList<Contact>(collection);
	}
	
	public boolean add(Contact contact)
	{
		boolean confirm = contacts.add(contact);
		Collections.sort(contacts);
		return confirm;
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
