public class Pianoforte extends StrumentoMusicale {
    int tasti;

    public Pianoforte(int tasti) {
        tasti = tasti;
    }

    public void suona() {
        System.out.println("Sto suonando un pianoforte con " + tasti + " tasti.");
    }
}
