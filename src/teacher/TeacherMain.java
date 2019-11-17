package teacher;

import static java.lang.System.out;

public class TeacherMain
{

	public static void main(String[] args)
	{
		Rubrica rubric = new RubricaOrdinata();
		Contatto contact = new Contatto( "Mario", "Rossi", "0214724");
		rubric.add(contact);
		contact = new Contatto("Mario", "Bianchi", "0321622569");
		rubric.add(contact);
		contact = new Contatto("Riccardo", "LayRoy", "0518060");
		rubric.add(contact);
		contact = new Contatto("Riccardo", "Cecci", "0321457889");
		rubric.add(contact);
		out.println(rubric.getLista());
	}

}
