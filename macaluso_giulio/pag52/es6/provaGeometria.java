public class provaGeometria {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5, 4);
        r.calcolaAreaRettangolo();
        r.calcolaPerimetroRettangolo();
        r.stampa();

        Triangolo t = new Triangolo(3, 4, 5);
        t.calcolaAreaTriangolo();
        t.calcolaPerimetroTriangolo();
        t.stampa();

        Ottagono o = new Ottagono(1, 2, 3, 4, 5, 6, 7, 8, 9);
        o.calcolaPerimetroOttagono();
        o.calcolaAreaOttagono();
        o.stampa();
    }
}
