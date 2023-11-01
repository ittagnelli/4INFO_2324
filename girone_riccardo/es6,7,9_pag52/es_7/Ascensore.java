class Ascensore {
    private int pianoCorrente;
    private int pianoDestinazione;
    private boolean[] pianiPrenotati;

    public Ascensore(int numPiani) {
        pianoCorrente = 0;
        pianoDestinazione = 0;
        pianiPrenotati = new boolean[numPiani];
    }

    public void impostaPianoDestinazione(int piano) {
        pianoDestinazione = piano;
    }

    public void prenotaPiano(int piano) {
        pianiPrenotati[piano] = true;
    }

    public void eseguiOperazioni() {
        if (pianoCorrente < pianoDestinazione) {
            sali();
        } else if (pianoCorrente > pianoDestinazione) {
            scendi();
        }
    }

    private void sali() {
        pianoCorrente++;
        System.out.println("L'ascensore è salito al piano " + pianoCorrente);
    }

    private void scendi() {
        pianoCorrente--;
        System.out.println("L'ascensore è sceso al piano " + pianoCorrente);
    }
}

public class TestAscensore {
    public static void main(String[] args) {
        Ascensore ascensore = new Ascensore(10);

        ascensore.impostaPianoDestinazione(5);
        ascensore.prenotaPiano(3);
        ascensore.prenotaPiano(8);

        ascensore.eseguiOperazioni();
        ascensore.eseguiOperazioni();
        ascensore.eseguiOperazioni();
    }
}
