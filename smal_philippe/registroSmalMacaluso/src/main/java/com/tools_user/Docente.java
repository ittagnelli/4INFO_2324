package com.tools_user;

import java.util.LinkedList;
import com.tools_log.getObjUser;

public class Docente extends User{
    private LinkedList<String> materie;
    private final String SEPARATOR_MATERIE_INPUT = ",";

    public Docente(String nome, String cognome, LinkedList<String> materie, String user, String password) {
        super(nome, cognome, user, password);
        this.materie = materie;
    }
    
    public Docente(String nome, String cognome, String materie, String password) {
        super(nome, cognome, nome.toLowerCase() + "." + cognome.toLowerCase(), password);
        this.materie = getObjUser.ArrayToList(getObjUser.StringToArray(materie, SEPARATOR_MATERIE_INPUT));
    }

    public LinkedList<String> getMaterie() {
        return materie;
    }

    public void setMaterie(LinkedList<String> materie) {
        this.materie = materie;
    }

    public String getMaterieStr() {
        String strMaterie = "";
        for (String materia : materie) strMaterie += materia + "-";

        return strMaterie.substring(0, strMaterie.length() - 1);
    }

    @Override
    public String toString() {
        return getNome() + " " + getCognome() + " " + getMaterieStr() + " " + super.toString();
    }
}
