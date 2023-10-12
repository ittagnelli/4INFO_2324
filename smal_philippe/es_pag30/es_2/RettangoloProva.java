import java.util.Scanner;
public class RettangoloProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valore;
        Rettangolo rettangolo_1 = new Rettangolo();
        Rettangolo rettangolo_2 = new Rettangolo();

        System.out.println("Inserisci la base del rettangolo 1 : ");
        valore = in.nextInt();
        rettangolo_1.setBase(valore);

        System.out.println("Inserisci l'altezza del rettangolo 1 : ");
        valore = in.nextInt();
        rettangolo_1.setAltezza(valore);

        System.out.println("Inserisci la base del rettangolo 2 : ");
        valore = in.nextInt();
        rettangolo_2.setBase(valore);

        System.out.println("Inserisci l'altezza del rettangolo 2 : ");
        valore = in.nextInt();
        rettangolo_2.setAltezza(valore);

        rettangolo_1.calcolaArea();
        rettangolo_1.calcolaPerimetro();

        rettangolo_2.calcolaArea();
        rettangolo_2.calcolaPerimetro();

        System.out.println(rettangolo_1);
        System.out.println(rettangolo_2);

        in.close();

    }
}
