import java.util.ArrayList;
import java.util.List;

public class Montacarichi {
    private int pianoCorrente;
    private List<Integer> pianiPrenotati;

    public Montacarichi() {
        this.pianoCorrente = 1;
        this.pianiPrenotati = new ArrayList<>();
    }

    public void prenotaPiano(int piano) {
        if (piano >= 1 && piano <= 10) {
            pianiPrenotati.add(piano);
            System.out.println("Piano " + piano + " prenotato.");
        } else {
            System.out.println("Piano non valido.");
        }
    }

    public void vaiAlProssimoPiano() {
        if (!pianiPrenotati.isEmpty()) {
            int prossimoPiano = pianiPrenotati.get(0);
            if (prossimoPiano > pianoCorrente) {
                System.out.println("L'ascensore si sta muovendo verso l'alto al piano " + prossimoPiano);
            } else if (prossimoPiano < pianoCorrente) {
                System.out.println("L'ascensore si sta muovendo verso il basso al piano " + prossimoPiano);
            } else {
                System.out.println("L'ascensore è arrivato al piano " + prossimoPiano);
                pianiPrenotati.remove(0);
            }
            pianoCorrente = prossimoPiano;
        } else {
            System.out.println("Nessun piano prenotato.");
        }
    }

    public int getPianoCorrente() {
        return pianoCorrente;
    }

    public List<Integer> getPianiPrenotati() {
        return pianiPrenotati;
    }

    public void eseguiMovimentoAscensore() {
        while (!pianiPrenotati.isEmpty()) {
            vaiAlProssimoPiano();
        }
    }
}