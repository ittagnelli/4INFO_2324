public class Chitarra extends StrumentoMusicale {
    private int corde;

    public Chitarra(String nome, int corde) {
        super(nome, "Chitarra");
        this.corde = corde;
    }

    public void pizzicaNota() {
        System.out.println("Nota pizzicata su " + getNome() + " - Corde: " + corde);
    }
}