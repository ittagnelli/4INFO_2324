public class Flauto extends StrumentoMusicale {
    private String materiale;

    public Flauto(String nome, String materiale) {
        super(nome, "Flauto");
        this.materiale = materiale;
    }

    public void soffiaNota() {
        System.out.println("Nota soffiata su " + getNome() + " - Materiale: " + materiale);
    }
}
