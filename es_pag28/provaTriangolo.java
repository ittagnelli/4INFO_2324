import java.util.Scanner;

public class provaTriangolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;

        triangolo forma = new triangolo();

        System.out.print("Inserisci la base: ");
        n = in.nextDouble();
        forma.setBase(n);
        System.out.print("Inserisci l'altezza: ");
        n = in.nextDouble();
        forma.setAltezza(n);
        System.out.print("Inserisci il lato: ");
        n = in.nextDouble();
        forma.setLato(n);

        forma.calcolaArea();
        forma.calcolaPerimetro();
        forma.stampa();
        forma.formaTriangolo();
    }    
}
