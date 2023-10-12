import java.util.Scanner;

public class ProvaFrazione {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Frazione frazione_1 = new Frazione();
        Frazione frazione_2 = new Frazione();
        int valore;

        System.out.println("Inserisci il numeratore della prima frazione: ");
        valore = in.nextInt();
        frazione_1.setNum(valore);

        System.out.println("Inserisci il denominatore della prima frazione: ");
        valore = in.nextInt();
        frazione_1.setDen(valore);

        System.out.println("Inserisci il numeratore della seconda frazione: ");
        valore = in.nextInt();
        frazione_2.setNum(valore);

        System.out.println("Inserisci il denominatore della seconda frazione: ");
        valore = in.nextInt();
        frazione_2.setDen(valore);

        frazione_1.calcolaSomma(frazione_2);
        frazione_1.calcolaDifferenza(frazione_2);
        frazione_1.calcolaProdotto(frazione_2);
        
        in.close();

    }
}
