import java.util.Scanner;

public class FrazioneProva {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Frazione frazione_1 = new Frazione();
        Frazione frazione_2 = new Frazione();
        int valore;

        System.out.println("Inserisci il numeratore della prima frazione: ");
        valore = in.nextInt();
        frazione_1.setNumeratore(valore);

        System.out.println("Inserisci il denominatore della prima frazione: ");
        valore = in.nextInt();
        frazione_1.setDenominatore(valore);

        System.out.println("Inserisci il numeratore della seconda frazione: ");
        valore = in.nextInt();
        frazione_2.setNumeratore(valore);

        System.out.println("Inserisci il denominatore della seconda frazione: ");
        valore = in.nextInt();
        frazione_2.setDenominatore(valore);

        frazione_1.calcolaSomma(frazione_2);
        frazione_1.calcolaDifferenza(frazione_2);
        frazione_1.calcolaProdotto(frazione_2);
        
        in.close();

    }
}
