import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            int x1, x2, y1, y2;
            // Segmento segmento1 = new Segmento(1, 1, 4, 4);
            // Segmento segmento2 = new Segmento(2, 2, 3, 3); --> di prova
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserire x1 primo segmento: ");
            x1 = scanner.nextInt();
            System.out.println("Inserire y1 primo segmento: ");
            y1 = scanner.nextInt();
            System.out.println("Inserire x2 primo segmento: ");
            x2 = scanner.nextInt();
            System.out.println("Inserire y2 primo segmento: ");
            y2 = scanner.nextInt();
            Segmento segmento1 = new Segmento(x1, y1, x2, y2);

            System.out.println("Inserire x1 secondo segmento: ");
            x1 = scanner.nextInt();
            System.out.println("Inserire y1 secondo segmento: ");
            y1 = scanner.nextInt();
            System.out.println("Inserire x2 secondo segmento: ");
            x2 = scanner.nextInt();
            System.out.println("Inserire y2 secondo segmento: ");
            y2 = scanner.nextInt();

            Segmento segmento2 = new Segmento(x1, y1, x2, y2);
            scanner.close();
            double lunghezza = segmento1.getLunghezza();
            DecimalFormat f = new DecimalFormat("##.000");

            System.out.println("Lunghezza del Segmento 1: " + f.format(lunghezza));

            lunghezza = segmento2.getLunghezza();
            System.out.println("Lunghezza del Segmento 2: " + f.format(lunghezza));

            if (segmento1.eInclusoIn(segmento2)) {
                System.out.println("Il Segmento 2 è completamente incluso nel Segmento 1.");
            } else if (segmento2.eInclusoIn(segmento1)) {
                System.out.println("Il Segmento 1 è completamente incluso nel Segmento 2.");
            } else {
                System.out.println("I segmenti non sono completamente inclusi l'uno nell'altro.");
            }
        } catch (Exception e) {
            if (e.toString() == "java.util.InputMismatchException") {
                System.out.println("Devi inserire un numero, non una lettera o un simbolo");
                //System.out.println(e);
            }
        }
    }
}
