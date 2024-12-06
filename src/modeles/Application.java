package modeles;

import java.util.ArrayList;

public class Application {

	ArrayList<Discipline> DisciplineList;
	ArrayList<Equipe> EquipeList;
	ArrayList<Pays> PaysList;
	ArrayList<Athlete> AthleteList;
	ArrayList<Utilisateur> UtilisateurList;
	Planning Planning;



	public Equipe getEquipe(int idEquipe) {
		return EquipeList.get(idEquipe);
	}
	
	
	public void ajouterEquipe(Equipe equipe) {
		EquipeList.add(equipe);
	}
	
	
	public Athlete getAthlete(int idAthlete) {
		return AthleteList.get(idAthlete);
	}
	
	public void ajouterAthlete(Athlete athlete) {
		AthleteList.add(athlete);
	}
	
	public Utilisateur getUtilisateur(int idUtilisateur) {
		return UtilisateurList.get(idUtilisateur);
	}
	
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		UtilisateurList.add(utilisateur);
	}
	
	
	public void ajouterPays(Pays Pays) {
		PaysList.add(Pays);
	}
	
	public void removePays(Pays Pays) {
		PaysList.remove(Pays);
	}
	
	public void removePaysFromId(int idPays) {
		PaysList.remove(idPays);
	}
	
	
	public static void main(String[] args) {
		
		
	}


}