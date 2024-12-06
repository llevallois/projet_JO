package modeles;

public class Athlete {

	Equipe Equipe;
	private String nomAthlete;
	private String prenomAthlete;
	private String dateDeNaissance;
	private String biographie;

	/**
	 * 
	 * @param nomAthlete
	 * @param prenomAthlete
	 * @param dateDeNaissance
	 * @param biographie
	 * @param equipeAthlete
	 */
	public Athlete(String nomAthlete, String prenomAthlete, String dateDeNaissance, String biographie, Equipe equipeAthlete) {
		// TODO - implement Athlete.Athlete
		throw new UnsupportedOperationException();
	}

	public String getNomAthlete() {
		return this.nomAthlete;
	}

	public void getPrenomAthlete() {
		// TODO - implement Athlete.getPrenomAthlete
		throw new UnsupportedOperationException();
	}

	public String getDateDeNaissance() {
		return this.dateDeNaissance;
	}

	public void getBiographie() {
		// TODO - implement Athlete.getBiographie
		throw new UnsupportedOperationException();
	}

	public Equipe getEquipe() {
		// TODO - implement Athlete.getEquipe
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nouveauNom
	 */
	public void setNomAthlete(String nouveauNom) {
		this.nomAthlete = nouveauNom;
	}

	/**
	 * 
	 * @param nouveauPrenom
	 */
	public void setPrenomAthlete(String nouveauPrenom) {
		this.prenomAthlete = nouveauPrenom;
	}

	/**
	 * 
	 * @param nouvelleDateNaissance
	 */
	public void setDateDeNaissance(String nouvelleDateNaissance) {
		this.dateDeNaissance = nouvelleDateNaissance;
	}

	/**
	 * 
	 * @param biographie
	 */
	public void setBiographie(int biographie) {
		// TODO - implement Athlete.setBiographie
		throw new UnsupportedOperationException();
	}

	public void setEquipe() {
		// TODO - implement Athlete.setEquipe
		throw new UnsupportedOperationException();
	}

}