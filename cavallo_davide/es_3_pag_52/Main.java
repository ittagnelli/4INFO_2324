public class Main {
    public static void main(String[] args) {
        StrumentoMusicale strumento = new StrumentoMusicale("Chitarra");
        Pianoforte pianoforte = new Pianoforte(88);

        strumento.suona(); 
        pianoforte.suona();
    }
}
