public class StrumentoMusicale {
    String tipo;

    public StrumentoMusicale(String tipo) {
        tipo = tipo;
    }

    public void suona() {
        System.out.println("Sto suonando uno strumento musicale di tipo " + tipo);
    }
}
