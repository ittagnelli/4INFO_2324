import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static boolean isEndWord(String word) {
        return word.equals("FINE");
    }

    public static boolean isEvenWord(String word) {
        return word.length() % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (
            BufferedWriter writerPari = new BufferedWriter(new FileWriter("filePari.txt"));
            BufferedWriter writerDispari = new BufferedWriter(new FileWriter("fileDispari.txt"))
        ) {

            String parola;

            do {
                parola = in.nextLine();

                if (isEndWord(parola)) {
                    continue;
                }

                BufferedWriter writer = (isEvenWord(parola) ? writerPari : writerDispari);
                writer.write(parola);
                writer.newLine();

            } while (!isEndWord(parola));

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
        }

        try (
            BufferedReader readerPari = new BufferedReader(new FileReader("filePari.txt"));
            BufferedReader readerDispari = new BufferedReader(new FileReader("fileDispari.txt"))
        ) {
            String parola;
            int[] pari = { 0, 0 };
            int[] dispari = { 0, 0 };

            while ((parola = readerPari.readLine()) != null) {
                pari[0]++;
                pari[1] += parola.length();
            }

            while ((parola = readerDispari.readLine()) != null) {
                dispari[0]++;
                dispari[1] += parola.length();
            }

            System.out.println("Parole pari lette: " + pari[0] + ", " + pari[1] + " caratteri letti.");
            System.out.println("Parole dispari lette: " + dispari[0] + ", " + dispari[1] + " caratteri letti.");

        } catch (IOException e) {
            System.err.println("C'è stato un errore: " + e.getMessage());
        }

    }
}
