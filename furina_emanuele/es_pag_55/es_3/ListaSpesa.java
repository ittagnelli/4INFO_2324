import java.util.ArrayList;
import java.util.Scanner;
public class ListaSpesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Prodotto> listaProdotti = new ArrayList<>();
        double totale = 0;

        while (true) {
            System.out.println("Inserisci il codice a barre (o 'fine' per terminare):");
            String codiceABarre = scanner.nextLine();
            if (codiceABarre.equalsIgnoreCase("fine")) {
                break;
            }

            System.out.println("Inserisci la descrizione del prodotto:");
            String descrizione = scanner.nextLine();

            System.out.println("Inserisci il prezzo unitario del prodotto:");
            double prezzoUnitario = Double.parseDouble(scanner.nextLine());

            System.out.println("Il prodotto è alimentare? (Sì/No):");
            boolean alimentare = scanner.nextLine().equalsIgnoreCase("Sì");

            String materiale = "";
            int giorniScadenza = 0;
            if (alimentare) {
                System.out.println("Inserisci il materiale (carta, vetro, plastica):");
                materiale = scanner.nextLine();
                System.out.println("Inserisci i giorni alla scadenza:");
                giorniScadenza = Integer.parseInt(scanner.nextLine());
            }

            Prodotto prodotto = new Prodotto(codiceABarre, descrizione, prezzoUnitario, alimentare, materiale, giorniScadenza);
            listaProdotti.add(prodotto);

            System.out.println("Prodotto aggiunto alla lista.");
        }

        System.out.println("Hai la tessera del negozio? (Sì/No):");
        boolean haTessera = scanner.nextLine().equalsIgnoreCase("Sì");

        System.out.println("Riepilogo della lista della spesa:");
        for (Prodotto prodotto : listaProdotti) {
            double prezzoTotale = prodotto.calcolaPrezzoTotale(haTessera);
            System.out.println(prodotto.descrizione + " - Prezzo totale: " + prezzoTotale);
            totale += prezzoTotale;
        }

        System.out.println("Totale: " + totale + " euro");
    }
}