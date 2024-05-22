package com.tools_log;

import com.tools_file.PathNAME;
import com.tools_user.*;

public class Ricerca {
	private String pathFolder;
	
	public Ricerca(String pathFolder, int userLevel) {
		this.pathFolder = pathFolder;
        if(userLevel == 0) this.pathFolder += PathNAME.PATH_ADMIN;
        else if(userLevel == 1) this.pathFolder += PathNAME.PATH_INSEGNANTI;
        else if(userLevel == 2) this.pathFolder += PathNAME.PATH_STUDENTI;
	}

    private boolean compareVar(String nameRead, String nameTake) {
        return (nameRead.compareTo(nameTake) == 0);
    }

    public Studente getStudente(String username, String passoword) {
        getObjUser<Studente> studente = new getObjUser<Studente>(pathFolder);
        int contatore = 0;

        while (studente.isFinished()) {
        	Studente utente = (Studente)studente.getObjLine();
            if(compareVar(utente.getUtente(), username) && compareVar(utente.getPassword(), passoword)) {
                utente.setIndexStudente(contatore);
                return utente;
            }
            else contatore ++;
        }

        return null;
    }

    public Docente getDocente(String username, String passoword) {
        getObjUser<Docente> docente = new getObjUser<Docente>(pathFolder);

        while (docente.isFinished()) {
        	Docente utente = (Docente)docente.getObjLine();
            if(compareVar(utente.getUtente(), username) && compareVar(utente.getPassword(), passoword)) return utente;
        }

        return null;
    }

    public User getAdmin(String username, String passoword) {
        getObjUser<User> admin = new getObjUser<User>(pathFolder);

        while (admin.isFinished()) {
        	User utente = (User)admin.getObjLine();
            if(compareVar(utente.getUtente(), username) && compareVar(utente.getPassword(), passoword)) return utente;
        }

        return null;
    }



}