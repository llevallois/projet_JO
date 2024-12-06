package modeles;

import java.util.*;

public class Lieu {

	ArrayList<Epreuve> epreuve;
	private int idLieu;
	private String nomLieu;

	/**
	 * 
	 * @param idLieu
	 * @param nomLieu
	 */
	public Lieu(int idLieu, String nomLieu) {
		// TODO - implement Lieu.Lieu
		throw new UnsupportedOperationException();
	}

	public String getNomLieu() {
		return this.nomLieu;
	}

	/**
	 * 
	 * @param nomDuLieu
	 */
	public void setNomLieu(String nomDuLieu) {
		this.nomLieu = nomDuLieu;
	}

}