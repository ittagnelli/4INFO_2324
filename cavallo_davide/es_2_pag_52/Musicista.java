public class Musicista {
    String nome;
    String strumento;

    public Musicista(String nomeMusicista, String strumentoSuonato) {
        nome = nomeMusicista;
        strumento = strumentoSuonato;
    }

    public void esegui() {
        System.out.println(nome + " sta suonando uno " + strumento + ".");
    }
}
