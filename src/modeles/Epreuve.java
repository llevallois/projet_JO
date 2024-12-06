package modeles;

import java.util.ArrayList;

public class Epreuve {

	private Discipline disciplineEpreuve;

	private String descriptionEpreuve;
	private String codeEpreuve;
	private ArrayList<Session> sessionsList;


	/**
	 * 
	 * @param idEpreuve
	 * @param descriptionEpreuve
	 * @param disciplineEpreuve
	 */
	
	public Epreuve (Discipline discipline, String code, String description, ArrayList<Session> sessions){
		disciplineEpreuve = discipline;
		codeEpreuve = code;
		descriptionEpreuve = description;
		sessionsList=sessions;
	}
	
	public void ajoutSession(Session s) {
		sessionsList.add(s);
	}
	
	public void supprimerSession(Session s) {
		sessionsList.remove(s);
	}
	
	public ArrayList<Session> getSessions(){
		return sessionsList;
	}

}