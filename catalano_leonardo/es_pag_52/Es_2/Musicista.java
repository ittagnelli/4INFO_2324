public class Musicista extends Persona {
    String strumento;

    public Musicista(String nome, int eta, String strumento) {
        super(nome, eta);
        this.strumento = strumento;
    }

    void suona() {
        System.out.println(nome + " sta suonando il " + strumento);
    }
}
