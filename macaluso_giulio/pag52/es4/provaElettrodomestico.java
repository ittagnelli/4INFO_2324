public class provaElettrodomestico {
    public static void main(String[] args) {
        Elettrodomestico e = new Elettrodomestico();
        e.setCosto(1000);
        e.stampa();

        Mobile m = new Mobile();
        m.setCosto(500);
        m.setDimensioni(5);
        m.stampa();

        Cellulare c = new Cellulare();
        c.setCosto(200);
        c.setDimensioni(7);
        c.setModello("iphone");
        c.stampa();
    }
}
