public class provaMusicisti {
    public static void main(String[] args) {
        Musicisti m = new Musicisti();

        m.setNome("Mario");
        m.stampa();

        Compositori c = new Compositori();

        c.setNome("Beethoven");
        c.setSpartito("Sonata al chiaro di luna");
        c.stampa();

        Cantanti ca = new Cantanti();

        ca.setNome("Sergio");
        ca.setSpartito("ciao");
        ca.setCanzone("buongiorno");
        ca.stampa();
    }
}
