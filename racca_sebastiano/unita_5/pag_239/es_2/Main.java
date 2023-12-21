import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero da cercare nella sequenza: ");
        int numeroDaCercare = scanner.nextInt();

        scanner.close();

        try (
            BufferedReader br = new BufferedReader(new FileReader("sequenza.txt"))
        ) {
            String linea;
            int occorrenze = 0;

            while ((linea = br.readLine()) != null) {
                String[] numeri = linea.split("\\s+");

                for (String numero : numeri) {
                    int currNum = Integer.parseInt(numero);

                    if (currNum == numeroDaCercare) {
                        occorrenze++;
                    }
                }
            }

            System.out.println("Il numero " + numeroDaCercare + " compare " + occorrenze + " volte in sequenza.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
