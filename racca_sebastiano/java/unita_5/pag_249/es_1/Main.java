import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[][] matrice = new int[3][3];

        try (
            BufferedReader reader = new BufferedReader(new FileReader("matrice.dat"))
        ) {
            String riga;
            int i = 0;

            while ((riga = reader.readLine()) != null && i < 3) {
                String[] numeriRiga = riga.split(" ");

                for (int j = 0; j < numeriRiga.length && j < 3; j++) {
                    matrice[i][j] = Integer.parseInt(numeriRiga[j]);
                }

                i++;
            }

            System.out.println("Matrice originale:");
            stampaMatrice(matrice);

            int[][] trasposta = calcolaTrasposta(matrice);
            System.out.println("\nTrasposta:");
            stampaMatrice(trasposta);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int[][] calcolaTrasposta(int[][] matrice) {
        int righe = matrice.length;
        int colonne = matrice[0].length;
        int[][] trasposta = new int[colonne][righe];

        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                trasposta[j][i] = matrice[i][j];
            }
        }

        return trasposta;
    }

    private static void stampaMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
