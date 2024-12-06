package modeles;

class Session {

	
	private String codeSession;
	private int heureDebutSession;
	private int minuteDebutSession;
	private int heureFinSession;
	private int minuteFinSession;
	private String dateEpreuve;
	private String typeSession;
	private String descriptionSession;
	
	Discipline disciplineSession;
	
	public Session(String codeSession, int heureDebut, int minuteDebut, int heureFin, int minuteFin, String date, String type, String description, Discipline discipline) {
		this.codeSession = codeSession;
		heureDebutSession = heureDebut;
		minuteDebutSession = minuteDebut;
		heureFinSession = heureFin;
		minuteFinSession = minuteFin;
		dateEpreuve = date;
		disciplineSession = discipline;
		descriptionSession = description;
		
		if(estBonType(type)) {
			typeSession = type;
		}
		else {
			throw new UnsupportedOperationException();
		}
	}
	
	private boolean estBonType(String type) {
		if(type.equals("Qualifications")|| type.equals("Médailles")){
			return true;
		}
		return false;
	}
	
}
