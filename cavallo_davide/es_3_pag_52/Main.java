public class Main {
    public static void main(String[] args) {
        StrumentoMusicale strumento = new StrumentoMusicale("Chitarra");
        Pianoforte pianoforte = new Pianoforte(88);

        strumento.suona(); // Stampa: Sto suonando uno strumento musicale di tipo Chitarra
        pianoforte.suona(); // Stampa: Sto suonando un pianoforte con 88 tasti.
    }
}
