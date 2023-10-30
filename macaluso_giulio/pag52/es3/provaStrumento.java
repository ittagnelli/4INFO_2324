public class provaStrumento {
    public static void main(String[] args) {
        Strumento s = new Strumento();

        s.setCosto(1000);
        s.stampa();

        Tasti t = new Tasti();

        t.setCosto(500);
        t.setNumero(4);
        t.stampa();

        Pianoforte p = new Pianoforte();
        
        p.setCosto(2000);
        p.setNumero(88);
        p.setCoda("si");
        p.stampa();
    }
}
