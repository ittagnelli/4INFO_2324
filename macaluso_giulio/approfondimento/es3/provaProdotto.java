public class provaProdotto {
    public static void main(String[] args) {
        Alimentare a = new Alimentare(30, 12345, "pane", 5);
        a.stampa();
        a.scontoTessera("si");
        a.scontoScadenza(25);
        a.stampa();
        Nonalimentare n = new Nonalimentare("plastica", 67890, "penna", 2);
        n.stampa();
        n.scontoTessera("");
        n.scontoMateriale("plastica");
        n.stampa();
    }
}
