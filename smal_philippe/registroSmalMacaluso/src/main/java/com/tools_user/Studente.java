package com.tools_user;

import java.util.LinkedList;

public class Studente extends User {
	private String sezione;
	private LinkedList<Voto> lsVoti;
	private int classe, indexStudente;
	
	public Studente(String nome, String cognome, String sezione, int classe, String utente, String password) {
		super(nome, cognome, utente, password);
		this.sezione = sezione;
		this.classe = classe;
	}
	
	public Studente(String nome, String cognome, String sezione, int classe, String utente, String password, int indexStudente) {
		super(nome, cognome, utente, password);
		this.sezione = sezione;
		this.classe = classe;
		this.indexStudente = indexStudente;
	}
	
	public Studente(String nome, String cognome, String sezione, int classe, String password) {
		super(nome, cognome, nome.toLowerCase() + "." + cognome.toLowerCase(), password);
		this.sezione = sezione;
		this.classe = classe;
	}

	public void setIndexStudente(int indexStudente) {
		this.indexStudente = indexStudente;
	}
	
	public int getIndexStudente() {
		return indexStudente;
	}
	

	public void setSezione(String sezione) {
		this.sezione = sezione;
	}
	
	public void setClasse(int classe) {
		this.classe = classe;
	}
	
	public String getSezione() {
		return sezione;
	}
	
	public int getClasse() {
		return classe;
	}

	public void setVoti(LinkedList<Voto> lsVoti) {
		this.lsVoti = lsVoti;
	}

	public LinkedList<Voto> getVoti() {
		return lsVoti;
	}
	
	@Override
	public String toString() {
		return getNome() + " " + getCognome() + " " + sezione + " " + classe + " " + super.toString();
	}
}