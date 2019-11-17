package teacher;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Classe che permette di gestire una rubrica
 * 
 * @see Contatto
 * @author Luca Piovesan
 *
 */
public class Rubrica {
	private LinkedList<Contatto> lista;
	/**
	 * La dimensione massima di una rubrica.
	 */
	public static final int maxDim = 5;

	/**
	 * Costruisce una rubrica vuota.
	 */
	public Rubrica() {
		setLista(new LinkedList<Contatto>());
	}

	/**
	 * Costruisce una rubrica contenente i contatti contenuti in <code>contatti</code>.
	 * @param contatti i contatti da aggiungere alla rubrica.
	 */
	public Rubrica(Collection<Contatto> contatti) {
		this();
		for(Contatto c : contatti) {
			this.add(c); //aggiungendo i contatti così, sfrutto eventuali controlli già scritti in add
		}
	}

	/**
	 * Aggiunge un nuovo Contatto a <em>this</em>.
	 * Se <em>this</em> già contiene <code>c</code> oppure contiene già il numero massimo
	 * di elementi, non aggiunge <code>c</code> e non fa nulla.
	 * @param c il contatto da aggiungere.
	 */
	public void add(Contatto c) {
		if(!getLista().contains(c) && getLista().size() < maxDim) getLista().add(c);	
	}
	
	/**
	 * Elimina e restituisce il primo contatto della lista con un certo nome e cognome.
	 * @param nome il nome del contatto da eliminare.
	 * @param cognome il cognome del contatto da eliminare.
	 * @return il contatto eliminato, <code>null</code> se nessun contatto corrisponde ai criteri.
	 */
	public Contatto delete(String nome, String cognome) {
		Contatto res = null;
		Contatto tmp = null;
		for(int i = 0; i<getLista().size(); i++) {
			tmp = getLista().get(i);
			if(tmp.nome == nome && tmp.cognome == cognome) {
				res = getLista().remove(i);
				return res;
			}
		}
		return res;
	}

	public LinkedList<Contatto> getLista()
	{
		return lista;
	}

	public void setLista(LinkedList<Contatto> lista)
	{
		this.lista = lista;
	}

}
