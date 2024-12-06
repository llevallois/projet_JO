package modeles;

import java.util.*;

public class Equipe {

	ArrayList<Athlete> AthleteList;
	Discipline Discipline;
	Pays Pays;
	Application Application;
	ArrayList<Recompense> RecompenseList;
	private int idEquipe;
	private String nomEquipe;

	/**
	 * 
	 * @param idEquipe
	 * @param nomEquipe
	 * @param paysEquipe
	 * @param disciplineEquipe
	 */
	public Equipe(int idEquipe, String nomEquipe, Pays Pays, Discipline Discipline) {
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
		this.Pays = Pays;
		this.Discipline = Discipline;
	}

	public String getNomEquipe() {
		return nomEquipe;
	}

	/**
	 * 
	 * @param nouveauNom
	 */
	public void setNomEquipe(String nouveauNom) {
		nomEquipe = nouveauNom;
	}
	
	public int getIdEquipe() {
		return idEquipe;
	}
	
	public void ajouterRecompense(Recompense Recompense) {
		RecompenseList.add(Recompense);
	}
	
	public void removeRecompense(Recompense Recompense) {
		RecompenseList.remove(Recompense);
	}
	
	public void removeRecompenseFromId(int idRecompense) {
		RecompenseList.remove(idRecompense);
	}

}