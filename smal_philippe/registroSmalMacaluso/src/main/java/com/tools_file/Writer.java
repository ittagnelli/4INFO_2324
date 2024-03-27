package com.tools_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Iterator;

public class Writer {
    private FileWriter file;
    private BufferedWriter buffer;
    private PrintWriter print;
    private String pathFile;
    

    public Writer(String pathFile, boolean append) {
        try {
            file = new FileWriter(pathFile, append); 
            buffer = new BufferedWriter(file);
            print = new PrintWriter(buffer);
            this.pathFile = pathFile;
        } catch(IOException e) {
            System.out.println("Errore: Impossibile aprire il file");
            System.exit(0);
        }
    }

    public Writer(String pathFile) {
        try {
            file = new FileWriter(pathFile); 
            this.pathFile = pathFile;
        } catch(IOException e) {
            System.out.println("Errore: Impossibile aprire il file");
            System.exit(0);
        }
    }

    void replceAll(LinkedList<String> lsLinee) {
        Writer wf = new Writer(pathFile);
        Iterator<String> it = lsLinee.iterator();
        
        wf.writeLine(it.next());
        while (it.hasNext()) wf.writeLine("\n" + it.next());
        wf.closeFile();
    }

    public void writeLine(String line) {
        try {
            file.write(line);
        } catch(IOException e) {
            System.out.println("Errore: Impossibile scrivere sul file");
            System.exit(0);
        }
    }

    public String getPathFile() {
        return pathFile;
    }

    public void addLine(String line) {
        print.print("\n"+line);
    }

    
    private boolean isNull(Object obj) {
        return obj != null;
    }

    public void closeFile() {
        try {
            if(isNull(print)) print.close();
            if(isNull(buffer)) buffer.close();
            if(isNull(file)) file.close();
        } catch(IOException e) {
            System.out.println("Errore: Impossibile chiudere il file");
            System.exit(0);
        }
    }

}
