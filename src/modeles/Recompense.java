package modeles;

public class Recompense {

	Equipe Equipe;
	Epreuve Epreuve;
	private int idRecompense;
	private String nomRecompense;

	/**
	 * 
	 * @param idRecompense
	 * @param nomRecompense
	 * @param equipeRecompense
	 * @param epreuve
	 */
	public Recompense(int idRecompense, String nomRecompense, Equipe equipeRecompense, Epreuve epreuve) {
		// TODO - implement Recompense.Recompense
		throw new UnsupportedOperationException();
	}

	public String getNomRecompense() {
		return this.nomRecompense;
	}

	/**
	 * 
	 * @param nomRecompense
	 */
	public void setNomRecompense(String nomRecompense) {
		this.nomRecompense = nomRecompense;
	}

}