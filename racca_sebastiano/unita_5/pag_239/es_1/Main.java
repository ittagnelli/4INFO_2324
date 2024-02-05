import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "nomi.txt";
        String outputFile = "NOMI2.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                String nomeMaiuscolo = linea.toUpperCase();
                writer.write(nomeMaiuscolo);
                writer.newLine();
            }

            System.out.println("Conversione completata.");

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
        }

    }
}
