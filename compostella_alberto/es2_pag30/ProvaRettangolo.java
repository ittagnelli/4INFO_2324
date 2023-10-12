import java.util.Scanner;
public class ProvaRettangolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valore;
        Rettangolo rettangolo_1 = new Rettangolo();
        Rettangolo rettangolo_2 = new Rettangolo();

        System.out.println("dichiara la base del primo rettangolo : ");
        valore = in.nextInt();
        rettangolo_1.setBase(valore);

        System.out.println("dichiara l'altezza del primo rettangolo: ");
        valore = in.nextInt();
        rettangolo_1.setAltezza(valore);

        System.out.println("dichiara la base del secondo rettangolo: ");
        valore = in.nextInt();
        rettangolo_2.setBase(valore);

        System.out.println("dichiara l'altezza del secondo rettangolo: ");
        valore = in.nextInt();
        rettangolo_2.setAltezza(valore);

        rettangolo_1.calcolaA();
        rettangolo_1.calcolaP();

        rettangolo_2.calcolaA();
        rettangolo_2.calcolaP();

        System.out.println(rettangolo_1);
        System.out.println(rettangolo_2);

        in.close();
}
}
