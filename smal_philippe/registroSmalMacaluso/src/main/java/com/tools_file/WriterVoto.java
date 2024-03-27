package com.tools_file;

import java.util.LinkedList;
import com.tools_user.Voto;

public class WriterVoto extends Writer{
    public WriterVoto(String pathFile, boolean append) {
        super(pathFile, append);
    }

    public void addVoto(int index, Voto voto) {
        Reader read = new Reader(getPathFile());
        LinkedList<String> lsStr = new LinkedList<String>();

        while(read.isFinished()) {
        	lsStr.add(read.getLine());
        }
        read.closeFile();
        
        lsStr.set(index, editLine(lsStr.get(index),
                        voto.getMateria() + "-" + voto));
        
        replceAll(lsStr);
    }

    public String editLine(String strVoti, String voto) {
        return voto + " " + strVoti;
    }
}
