package com.tools_log;

import com.tools_file.PathNAME;
import com.tools_user.*;
import com.tools_file.Reader;
import java.util.LinkedList;

public class RicercaVoti {
    private String pathFolder;
	private final String SEPARATOR_SPACE = " ";
	private final String SEPARATOR_VOTO = "-";
	private final int VOTO_NULL = -1;
	public static String MATERIA_NULL = "null";
	
	public RicercaVoti(String pathFolder) {
		this.pathFolder = pathFolder + PathNAME.PATH_VOTI;
	}
	
	private LinkedList<Voto> ArrayToList(String[] arrayStr) {
		LinkedList<Voto> lsVotiUtente = new LinkedList<Voto>(); 
		
        for (String str : arrayStr) {
        	if(str.compareTo("null") == 0) {
        		lsVotiUtente.add(new Voto(VOTO_NULL, MATERIA_NULL));
        	} else {
            	String[] infoVoto = StringToArray(str, SEPARATOR_VOTO);
            	lsVotiUtente.add(new Voto(Float.valueOf(infoVoto[1]), infoVoto[0]));
        	}

        }
        
        return lsVotiUtente;
	}

    private String[] StringToArray(String line, String splitter) {
        return line.split(splitter);
    }
	
	public LinkedList<Voto> getListaVoti(int index_user) {
		Reader read = new Reader(pathFolder);
		for(int indexLINE = 0; indexLINE < index_user; indexLINE++) read.getLine();
		return ArrayToList(StringToArray(read.getLine(), SEPARATOR_SPACE));
	}

}
