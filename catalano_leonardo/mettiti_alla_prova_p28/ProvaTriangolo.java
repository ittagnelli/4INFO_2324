import java.util.Scanner;

public class ProvaTriangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del  lato1 ");
        double lato1 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del  lato2: ");
        double lato2 = scanner.nextDouble();

        System.out.println("Inserisci la lunghezza del  lato3: ");
        double lato3 = scanner.nextDouble();
        scanner.close();

        TriangoloSoluzione triangolo = new TriangoloSoluzione(lato1, lato2, lato3);

        triangolo.TipodiTriangolo();
        triangolo.visualizzaRisultati();
    }
}