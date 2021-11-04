package e_voting;

public abstract class Utente {
	//ATTRIBUTI
	private final int id;
	private int password;
	
	//COSTRUTTORI
	public Utente(int id, int password) {
		this.id = id;
		this.setPassword(password);
	}
	
	public void setPassword(int password) {
		this.password = password;
	}

	public void visualizzaEsito(Sessione s) {
		
	}
}