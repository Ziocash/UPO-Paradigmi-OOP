package teacher;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe che permette di gestire una rubrica nella quale i contatti sono ordinati in ordine alfabetico
 * per cognome e nome.
 * @see Rubrica
 * @see Contatto
 * @author Luca Piovesan
 *
 */
public class RubricaOrdinata extends Rubrica {

	/**
	 * Costruisce una rubrica vuota.
	 */
	public RubricaOrdinata() {
		super();
	}

	/**
	 * Costruisce una rubrica contenente i contatti contenuti in <code>contatti</code>.
	 * @param contatti i contatti da aggiungere alla rubrica.
	 */
	public RubricaOrdinata(Collection<Contatto> contatti) {
		super(contatti);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void add(Contatto c) {
		if(!getLista().contains(c) && getLista().size() < maxDim) {
			Contatto tmp = null;
			boolean inserted = false;
			for(int i=0;i<getLista().size() && !inserted;i++) {
				tmp = getLista().get(i);
				switch(tmp.cognome.compareTo(c.cognome)) {
				case -1: //tmp < c
					//non fare nulla, questo case è messo a solo scopo di completezza
					break;
				case 0: //tmp.cognome == c.cognome
					if(tmp.nome.compareTo(c.nome)==1) {
						getLista().add(i, c);
						inserted = true;
					}
					//else non fare nulla
					break;
				case 1: //tmp > c
					getLista().add(i, c);
					inserted = true;
					break;
				}
			}
			if(!inserted) {
				getLista().addLast(c);
			}
		}
	}
	
	/**
	 * Elimina e restituisce i contatti definiti in <code>elementi</code>. 
	 * @param elementi una lista formata da (nome, cognome)*.
	 * @return un array di Contatto contenente gli elementi eliminati.
	 */
	public Contatto[] deleteAll(String ...elementi) {
		if(elementi.length % 2 == 0) {
			ArrayList<Contatto> res = new ArrayList<>();
			for(int i = 0;i<elementi.length-1;i=i+2) {
				Contatto deleted = this.delete(elementi[i+1], elementi[i]);
				if(deleted != null) res.add(deleted);
			}
			return (Contatto[]) res.toArray();
		}
		else return null;
	}
	
	

}
