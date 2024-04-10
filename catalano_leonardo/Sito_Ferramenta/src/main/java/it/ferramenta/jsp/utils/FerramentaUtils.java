package it.ferramenta.jsp.utils;

import java.util.ArrayList;
import java.util.List;

import it.ferramenta.jsp.dto.Utente;

public class FerramentaUtils {
	public static List<Utente> elencoUtenti() {
		Utente utente = new Utente();
		Utente utente2= new Utente();
		utente.setNome("leonardo");
		utente.setCognome("calabria");
		utente2.setNome("gigi");
		utente2.setCognome("grandecampione");
		
		List <Utente> lista= new ArrayList <Utente>();
		lista.add(utente);
		lista.add(utente2);
		return lista;

	}
}
