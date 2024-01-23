public class Bicicletta extends Mezzo {
    public int marce;

    public Bicicletta(int r, int m) {
        super(r);
        marce = m;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("marce: " + marce);
    }
}
