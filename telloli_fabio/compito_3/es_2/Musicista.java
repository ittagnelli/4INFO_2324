public class Musicista extends Cantante {
    private String strumento;

    public Musicista(String nome, String stru) {
        super(nome);
        strumento = stru;
    }

    public void suona() {
        System.out.println("musicista:" + getNome() + " Strumento:" + strumento);
    }
}
