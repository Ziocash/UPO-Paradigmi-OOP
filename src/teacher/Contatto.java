package teacher;

/**
 * Classe che rappresenta un contatto di una rubrica nella sua versione più semplice. 
 * Contiene un nome, un cognome ed un numero telefonico (tutte stringhe).
 * 
 * @author Luca Piovesan
 *
 */
public class Contatto {
	protected String nome;
	protected String cognome;
	protected String numeroTelefonico;

	/**
	 * Costruisce un nuovo contatto a partire dal nome, il cognome ed il numero telefonico.
	 * 
	 * @param nome il nome di battesimo del contatto.
	 * @param cognome il nome di famiglia del contatto.
	 * @param numeroTelefonico il numero di telefono.
	 */
	public Contatto(String nome, String cognome, String numeroTelefonico) {
		this.nome = nome;
		this.cognome = cognome;
		this.numeroTelefonico = numeroTelefonico;
	}

	/**
	 * Costruisce un nuovo contatto con lo stesso nome e cognome di <code>contatto</code>, 
	 * ma con diverso numero telefonico.
	 * 
	 * @param contatto il contatto da cui prendere nome e cognome.
	 * @param numeroTelefonico il nuovo numero telefonico.
	 */
	public Contatto(Contatto contatto, String numeroTelefonico) {
		//Attenzione: di seguito 2 proposte. La prima (commentata) esegue un controllo 
		//su contatto, la seconda riutilizza il primo costruttore
		/*if(contatto != null) {
			this.nome = contatto.nome;
			this.cognome = contatto.cognome;
			this.numeroTelefonico = numeroTelefonico;
		}*/
		this(contatto.nome, contatto.cognome, numeroTelefonico);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "nome=" + nome + ", cognome=" + cognome + ", numeroTelefonico=" + numeroTelefonico;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Contatto) {
			Contatto c = (Contatto) o;
			if(c.nome != this.nome || c.cognome != this.cognome || c.numeroTelefonico != this.numeroTelefonico) {
				return false;
			}
			return true;
		}
		else return false;
	}

}
