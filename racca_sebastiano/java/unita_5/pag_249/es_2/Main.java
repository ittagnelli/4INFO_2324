import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static String NUMERI = "numeri.txt";
    public static String NUMERI_CRESCENTE = "crescente.txt";
    public static String NUMERI_DECRESCENTE = "decrescente.txt";

    public static void main(String[] args) {
        try(
            BufferedWriter writer = new BufferedWriter(new FileWriter(NUMERI));
            BufferedReader reader = new BufferedReader(new FileReader(NUMERI))
        ) {

            scriviNumeriRand(writer);
            writer.close();
            leggiEScrivi(reader);

        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void scriviNumeriRand(BufferedWriter writer) throws IOException {
        for (int i = 0; i < rand(100, 200); i++) {
            writer.write(String.valueOf(rand(0, 100)) + "\n");
        }
    }

    private static void leggiEScrivi(BufferedReader numeriReader) throws IOException {
        try (
            BufferedWriter writerCrescente = new BufferedWriter(new FileWriter(NUMERI_CRESCENTE));
            BufferedWriter writerDecrescente = new BufferedWriter(new FileWriter(NUMERI_DECRESCENTE));
        ) {

            ArrayList<Integer> numeri = new ArrayList<>();
            String linea;

            while ((linea = numeriReader.readLine()) != null) {
                numeri.add(Integer.parseInt(linea));
            }

            Collections.sort(numeri);
            Object[] numeriArray = numeri.toArray();

            for(int i = 0; i < numeriArray.length; i++) {
                writerCrescente.write(numeriArray[i].toString() + "\n");
                writerDecrescente.write(numeriArray[numeriArray.length - i -1].toString() + "\n");
            }

            writerCrescente.close();
            writerDecrescente.close();

        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    private static int rand(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
