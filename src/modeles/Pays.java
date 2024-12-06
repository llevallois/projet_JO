package modeles;

import java.util.*;

public class Pays {

	ArrayList<Equipe> Equipe;
	Application Application;
	ArrayList<Equipe> EquipeList;
	
	private int idPays;
	private String nomPays;

	/**
	 * 
	 * @param idPays
	 * @param nomPays
	 */
	public Pays(int idPays, String nomPays) {
		// TODO - implement Pays.Pays
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param i
	 */
	public String getNomPays(int i) {
		return this.nomPays;
	}

	/**
	 * 
	 * @param nouveauNom
	 */
	public void setNomPays(String nouveauNom) {
		this.nomPays = nouveauNom;
	}
	
	public void ajouterEquipe(Equipe Equipe) {
		EquipeList.add(Equipe);
	}
	
	public void removeEquipe(Equipe Equipe) {
		EquipeList.remove(Equipe);
	}
	
	public void removeEquipeFromId(int idEquipe) {
		EquipeList.remove(idEquipe);
	}

}