import java.util.ArrayList;
import java.util.Scanner;

class Prodotto {
    private String codiceABarre;
    public String descrizione;
    private double prezzoUnitario;
    private boolean alimentare;
    private String materiale;
    private int giorniScadenza;

    public Prodotto(String codiceABarre, String descrizione, double prezzoUnitario, boolean alimentare, String materiale, int giorniScadenza) {
        this.codiceABarre = codiceABarre;
        this.descrizione = descrizione;
        this.prezzoUnitario = prezzoUnitario;
        this.alimentare = alimentare;
        this.materiale = materiale;
        this.giorniScadenza = giorniScadenza;
    }

    public double calcolaPrezzoTotale(boolean haTessera) {
        double sconto = haTessera ? 0.05 : 0.0;
        double prezzoTotale = prezzoUnitario;

        if (alimentare) {
            if (giorniScadenza < 10) {
                sconto = 0.20;
            }
        } else {
            if (materiale.equalsIgnoreCase("carta") || materiale.equalsIgnoreCase("vetro") || materiale.equalsIgnoreCase("plastica")) {
                sconto = 0.10;
            }
        }

        prezzoTotale -= prezzoUnitario * sconto;
        return prezzoTotale;
    }
}
