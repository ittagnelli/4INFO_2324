public class Compositore extends Musicista {
    String stileComposizione;

    public Compositore(String nome, int eta, String strumento, String stileComposizione) {
        super(nome, eta, strumento);
        this.stileComposizione = stileComposizione;
    }

    void compone() {
        System.out.println(nome + " sta facendo musica: " + stileComposizione);
    }
}