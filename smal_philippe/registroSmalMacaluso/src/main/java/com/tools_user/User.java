package com.tools_user;

public class User {
    private String nome, cognome, utente, password;

    public User(String nome, String cognome, String utente, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.utente = utente;
        this.password = password;
    }
    
    public User(String nome, String cognome, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.utente = nome.toLowerCase() + "." + cognome.toLowerCase();
        this.password = password;
    }

    public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUtente(String utente) {
        this.utente = utente;
    }

    public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}

    public String getPassword() {
        return password;
    }

    public String getUtente() {
        return utente;
    }

    public String toString() {
        return utente + " " + password;
    }
}
