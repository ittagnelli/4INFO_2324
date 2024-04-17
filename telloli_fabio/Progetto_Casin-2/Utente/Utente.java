package Utente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utente {
    private String email;
    private String password;
    private Integer crediti;
    
    public Utente(String email, String password, Integer crediti) {
        this.email = email;
        this.password = password;
        this.crediti = crediti;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Integer getCrediti() {
        return crediti;
    }

    public void setCrediti(Integer crediti) {
        this.crediti = crediti;
    }

    @Override
    public String toString() {
        return email + " " + password + " " + crediti;
    }

    public void salvaCrediti(String nomeFile) {
        try {
            File file = new File(nomeFile);
            File tempFile = new File("provaTemp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(email)) {
                    line = email + " " + password + " " + crediti;
                }
                
                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            file.delete();
            tempFile.renameTo(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}