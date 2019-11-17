package rubric;

public class ContactWithAddress extends Contact
{
	protected String address;
	
	public ContactWithAddress(Contact contact, String address)
	{
		super(contact.getName(), contact.getSurname(), contact.getNumber());
		this.address = address;
	}
	
	public ContactWithAddress(String name, String surname, String number, String address)
	{
		super(name, surname, number);
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " Address: " + address;
	}
}
