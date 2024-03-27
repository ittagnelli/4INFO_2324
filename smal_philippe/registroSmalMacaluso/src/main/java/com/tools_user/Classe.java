package com.tools_user;

import com.tools_file.*;
import java.util.ArrayList;

public class Classe{
    private Reader read;
    private ArrayList<Studente> lsClasse;

    public Classe(String pathFolder) {
        read = new Reader(pathFolder + PathNAME.PATH_STUDENTI);
        lsClasse = new ArrayList<Studente>();
    }

    private String[] StringToArray(String line, String splitter) {
        return line.split(splitter);
    }

    private boolean controllaClasse(String classeRead, String classeTake) {
        return classeRead.compareTo(classeTake) == 0;
    }

    public void loadClasse(String classe) {
    	int contatore = 0;
    	
        while(read.isFinished()) {
            String[] lsLine = StringToArray(read.getLine(), " ");
            
            if(controllaClasse(classe, lsLine[3] + " " + lsLine[2])) 
				lsClasse.add(new Studente(lsLine[0], lsLine[1], lsLine[2], 
                                          	Integer.valueOf(lsLine[3]), lsLine[4], 
                                            lsLine[5], contatore));
            contatore ++;
        }
    }

    public ArrayList<Studente> getClasse() {
        return lsClasse;
    }
}
