package e_voting;

public class Elettore extends Utente {
	//ATTRIBUTI
	private final String nome;
	private final String cognome;
	private final String sesso;
	private final String data_di_nascita;
	private final String luogo_di_nascita;
	private final String comune_di_residenza;
	private final String indirizzo;
	private final int numero_tessera_elettorale;
	private Boolean haDiritto;
	
	//COSTRUTTORI
	public Elettore(int id, int password) {
		super(id, password);
	}
	
	//METODI
	public void elencaCandidati(Sessione s) {
		
	}
	
	public void registraVoto(Sessione s, Candidato c) {
		
	}
}