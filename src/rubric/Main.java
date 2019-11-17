package rubric;

public class Main 
{
	public static void main(String[] args) 
	{
		Rubric rubric = new SortedRubric();
		Contact contact = new Contact("Mario", "Rossi", "0321666256");
		rubric.add(contact);
		contact = new Contact("Mario", "Bianchi", "0321622569");
		rubric.add(contact);
		contact = new Contact("Riccardo", "LayRoy", "0518060");
		rubric.add(contact);
		contact = new Contact("Riccardo", "Cecci", "0321457889");
		rubric.add(contact);
		
		System.out.println(rubric.print());
	}
}
