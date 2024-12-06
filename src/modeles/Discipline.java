package modeles;

import java.util.*;

public class Discipline {

	ArrayList<Application> Application;
	Equipe Equipe;
	ArrayList<Epreuve> Epreuve;
	private int idDiscipline;
	private String nomDiscipline;
	private String histoireDiscipline;

	/**
	 * 
	 * @param idDiscipline
	 * @param nomDiscipline
	 * @param histoireDiscipline
	 */
	public Discipline(int idDiscipline, String nomDiscipline, String histoireDiscipline) {
		// TODO - implement Discipline.Discipline
		throw new UnsupportedOperationException();
	}

	public String getNomDiscipline() {
		return this.nomDiscipline;
	}

	public String getHistoireDiscipline() {
		return this.histoireDiscipline;
	}

	/**
	 * 
	 * @param nouveauNom
	 */
	public void setNomDiscipline(String nouveauNom) {
		this.nomDiscipline = nouveauNom;
	}

	/**
	 * 
	 * @param nouvelleHistoire
	 */
	public void setHistoireDiscipline(String nouvelleHistoire) {
		this.histoireDiscipline = nouvelleHistoire;
	}

}