public class Main {
    public static void main(String[] args) {
        Auto a = new Auto("a1", "audi", 1999);
        a.stampa();
        Automezzo am = new Automezzo("f40", "ferrari", 1990, 5);
        am.stampa();
        Camion c = new Camion("urakan", "lamborghini", 2023, 3, "oggetti");
        c.stampa();
    }
}
