public class Pianoforte extends StrumentoMusicale {
    private int tasti;

    public Pianoforte(String nome, int tasti) {
        super(nome, "Pianoforte");
        this.tasti = tasti;
    }

    public void suonaNota() {
        System.out.println("Nota suonata su " + getNome() + " - Tasti: " + tasti);
    }
}
