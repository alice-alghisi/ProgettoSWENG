package e_voting;

import java.util.List;

public class Scrutatore extends Utente {
	
	//COSTRUTTORI
	public Scrutatore(int id, int password) {
		super(id, password);
	}

	//METODI
	public Sessione startSessioneVoto(Modalità m, Criterio c) {
	}

	public void addCandidates(Sessione e, List<Candidato> lista) {
		
	}
	
	public void stopSessione(Sessione s) {
		
	}
	
	public void startScrutinio(Sessione s) {
		
	}
}
