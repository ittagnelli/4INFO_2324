import java.util.Scanner;

class Rettangolo {
    private double altezza;
    private double larghezza;

    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public boolean isQuadrato() {
        return altezza == larghezza;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Inserisci l'altezza del primo rettangolo: ");
        double altezza1 = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del primo rettangolo: ");
        double larghezza1 = scanner.nextDouble();

        System.out.print("Inserisci l'altezza del secondo rettangolo: ");
        double altezza2 = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del secondo rettangolo: ");
        double larghezza2 = scanner.nextDouble();

        Rettangolo rettangolo1 = new Rettangolo(altezza1, larghezza1);
        Rettangolo rettangolo2 = new Rettangolo(altezza2, larghezza2);

        System.out.println("Rettangolo 1:");
        System.out.println("Area: " + rettangolo1.calcolaArea());
        System.out.println("Perimetro: " + rettangolo1.calcolaPerimetro());
        System.out.println("È un quadrato? " + rettangolo1.isQuadrato());

        System.out.println("Rettangolo 2:");
        System.out.println("Area: " + rettangolo2.calcolaArea());
        System.out.println("Perimetro: " + rettangolo2.calcolaPerimetro());
        System.out.println("È un quadrato? " + rettangolo2.isQuadrato());

        scanner.close();
    }
}
