package com.tools_log;

import com.tools_file.*;
import com.tools_user.*;

import java.util.LinkedList;

public class getObjUser <T> {
    private Reader read;
	private final String SEPARATOR_SPACE = " ";
	private final String SEPARATOR_VOTO = "-";
	
	public getObjUser(String pathFolder) {
        read = new Reader(pathFolder);
	}

    
	public static LinkedList<String> ArrayToList(String[] arrayStr) {
		LinkedList<String> stackVotiUtente = new LinkedList<String>(); 
        for (String str : arrayStr) {
        	stackVotiUtente.add(str.replace(" ", ""));
        }
        
        return stackVotiUtente;
	}

    public static String[] StringToArray(String line, String splitter) {
        return line.split(splitter);
    }


    private Object getObj(String line) {
        String[] studente = StringToArray(line, SEPARATOR_SPACE);
        if(studente.length == 6) return new Studente(studente[0], 
                                                        studente[1], 
                                                        studente[2], 
                                                        Integer.valueOf(studente[3]), 
                                                        studente[4], 
                                                        studente[5]);

        else if(studente.length == 5) return new Docente(studente[0], studente[1], ArrayToList(StringToArray(studente[2], SEPARATOR_VOTO)), studente[3], 
                                        studente[4]);
                                        
        else if(studente.length == 4) return new User(studente[0], 
                                        studente[1], studente[2], studente[3]);
        else return null;

    }

    public Object getObjLine() {

        return getObj(read.getLine());
    }

    public boolean isFinished() {
        return read.isFinished();
    }

}