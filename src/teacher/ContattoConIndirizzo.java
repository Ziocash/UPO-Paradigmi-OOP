package teacher;

/**
 * Estende un contatto semplice aggiungendo anche un indirizzo.
 * @author Luca Piovesan
 *
 */
public class ContattoConIndirizzo extends Contatto {
	protected String indirizzo;

	/**
	 * Costruisce un nuovo contatto a partire da nome, cognome, numero telefonico e indirizzo.
	 * 
	 * @param nome il nome di battesimo del contatto.
	 * @param cognome il nome di famiglia del contatto.
	 * @param numeroTelefonico il numero di telefono.
	 * @param indirizzo l'indirizzo del contatto.
	 */
	public ContattoConIndirizzo(String nome, String cognome, String numeroTelefonico, String indirizzo) {
		super(nome, cognome, numeroTelefonico);
		this.indirizzo = indirizzo;
	}

	/**
	 * Costruisce un nuovo contatto con lo stesso nome e cognome di <code>contatto</code>, 
	 * ma con diverso numero telefonico e diverso indirizzo.
	 * 
	 * @param contatto il contatto da cui prendere nome e cognome.
	 * @param numeroTelefonico il nuovo numero telefonico.
	 * @param indirizzo il nuovo indirizzo
	 */
	public ContattoConIndirizzo(Contatto contatto, String numeroTelefonico, String indirizzo) {
		super(contatto, numeroTelefonico);
		this.indirizzo = indirizzo;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return super.toString() + ", indirizzo=" + indirizzo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof ContattoConIndirizzo) {
			return (super.equals(o) && ((ContattoConIndirizzo) o).indirizzo == indirizzo);
		}
		return false;
	}
	
	

}
