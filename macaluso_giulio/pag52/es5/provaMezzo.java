public class provaMezzo {
    public static void main(String[] args) {
        Mezzo m = new Mezzo();
        m.setPorte(2);
        m.setRuote(6);
        m.stampa();

        Automobile a = new Automobile();
        a.setPorte(5);
        a.setRuote(4);
        a.setCosto(10000);
        a.stampa();

        Citycar c = new Citycar();
        c.setPorte(3);
        c.setRuote(4);
        c.setCosto(7000);
        c.setDimensioni(3);
        c.stampa();
    }
}
