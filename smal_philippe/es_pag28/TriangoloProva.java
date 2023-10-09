import java.util.Scanner;

public class TriangoloProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value;
        Triangolo tris = new Triangolo();
        System.out.println("Inserisci la base: ");
        value = in.nextInt();
        tris.setBase(value);
        System.out.println("Inserisci l'altezza: ");
        value = in.nextInt();
        tris.setAltezza(value);
        System.out.println("Inserisci il lato: ");
        value = in.nextInt();
        tris.setLato(value);
        tris.calcolaArea();
        tris.calcolaPerimetro();
        tris.riconosciTriangolo();
        tris.stampa();
        in.close();
    }
}
