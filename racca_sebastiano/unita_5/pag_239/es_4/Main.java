import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
            FileReader reader = new FileReader("in.txt");
            FileWriter writer = new FileWriter("out.txt");
        ) {
            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copiato.");

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
        }
    }
}
