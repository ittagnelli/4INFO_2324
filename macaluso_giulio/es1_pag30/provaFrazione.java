import java.util.Scanner;

public class provaFrazione {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        frazione frazione1 = new frazione();
        System.out.print("Inserisci il numeratore: ");
        n = in.nextInt();
        frazione1.setNumeratore(n);
        System.out.print("Inserisci il denominatore: ");
        n = in.nextInt();
        frazione1.setDenominatore(n);

        frazione frazione2 = new frazione();
        System.out.print("Inserisci il numeratore: ");
        n = in.nextInt();
        frazione2.setNumeratore(n);
        System.out.print("Inserisci il denominatore: ");
        n = in.nextInt();
        frazione2.setDenominatore(n);
        
        frazione1.stampa();
        frazione2.stampa();

        frazione1.somma(frazione1.getNumeratore(), frazione1.getDenominatore(), frazione2.getNumeratore(), frazione2.getDenominatore());
        frazione1.sottrazione(frazione1.getNumeratore(), frazione1.getDenominatore(), frazione2.getNumeratore(), frazione2.getDenominatore());
        frazione1.prodotto(frazione1.getNumeratore(), frazione1.getDenominatore(), frazione2.getNumeratore(), frazione2.getDenominatore());
    }
}
