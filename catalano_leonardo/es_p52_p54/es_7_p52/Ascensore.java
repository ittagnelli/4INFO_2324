public class Ascensore {
    private int pianoCorrente;

    public void prenotaPiano(int piano) {
        eseguiOperazioni(piano);
    }

    public void eseguiOperazioni(int prossimoPiano) {
        System.out.println("L'ascensore si sta muovendo dal piano " + pianoCorrente + " al piano " + prossimoPiano);
        pianoCorrente = prossimoPiano;
        System.out.println("L'ascensore e' arrivato al piano " + prossimoPiano);
    }

    public int getPianoCorrente() {
        return pianoCorrente;
    }
}