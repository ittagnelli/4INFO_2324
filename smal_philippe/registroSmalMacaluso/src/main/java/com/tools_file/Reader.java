package com.tools_file;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    private FileReader file;
    private Scanner in;

    public Reader(String pathFile) {
        try {
            file = new FileReader(pathFile);
            in = new Scanner(file);
            
        } catch(IOException e) {
            System.out.println("Errore: Impossibile aprire il file");
            System.exit(0);
        }
    }

    public String getLine() {
        return in.nextLine();
    }

    public boolean isFinished() {
        return in.hasNext();
    }

    public void closeFile() {
        try {
            in.close();
            file.close();
        } catch(IOException e) {
            System.out.println("Errore: Impossibile chiudere il file");
            System.exit(0);
        }
    }
}
