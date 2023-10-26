class ProvaClasse{
public class Main {
    public static void main(String[] args) {
        StrumentoMusicale violino = new StrumentoMusicale("Violino", "Corda");
        Pianoforte pianoforte = new Pianoforte("Yamaha", 88);

        violino.suona();
        pianoforte.suona();
        pianoforte.accorda();
    }
}
