import java.util.Scanner;

public class provaRettangolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;

        rettangolo rettangolo1 = new rettangolo();
        System.out.print("Inserisci la base: ");
        n = in.nextDouble();
        rettangolo1.setBase(n);
        System.out.print("Inserisci l'altezza: ");
        n = in.nextDouble();
        rettangolo1.setAltezza(n);

        rettangolo rettangolo2 = new rettangolo();
        System.out.print("Inserisci la base: ");
        n = in.nextDouble();
        rettangolo2.setBase(n);
        System.out.print("Inserisci l'altezza: ");
        n = in.nextDouble();
        rettangolo2.setAltezza(n);

        rettangolo1.calcolaArea();
        rettangolo1.calcolaPerimetro();
        rettangolo1.stampa();
        rettangolo2.calcolaArea();
        rettangolo2.calcolaPerimetro();
        rettangolo2.stampa();
    }
}
