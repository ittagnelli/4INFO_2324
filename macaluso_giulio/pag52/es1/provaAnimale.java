public class provaAnimale {
    public static void main(String[] args) {
        Animale a = new Animale();

        a.setNome("animale");
        a.stampa();

        Terrestre t = new Terrestre();
        t.setNome("terrestre");
        t.setZampe(4);
        t.stampa();

        Mucca m = new Mucca();
        m.setNome("mucca");
        m.setZampe(4);
        m.setFigli(2);
        m.stampa();
    }
}
