package rubric;

public class Main 
{
	public static void main(String[] args) 
	{
		Rubric rubric = new SortedRubric();
		Contact contact = new Contact();
		contact.setName("Mario");
		contact.setSurname("Rossi");
		contact.setNumber("0321666256");
		rubric.add(contact);
		contact = new Contact();
		contact.setName("Mario");
		contact.setSurname("Bianchi");
		contact.setNumber("0321622569");
		rubric.add(contact);
		contact = new Contact();
		contact.setName("Riccardo");
		contact.setSurname("LayRoy");
		contact.setNumber("0518060");
		rubric.add(contact);
		contact = new Contact();	
		contact.setName("Riccardo");	
		contact.setSurname("Cecci");
		contact.setNumber("0321457889");
		rubric.add(contact);
		
		
		System.out.println(rubric.print());
	}
}
