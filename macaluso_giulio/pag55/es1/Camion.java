public class Camion extends Automezzo{
    private String merce;

    Camion(String t, String mo, String ma, int a, int p, String me) {
        super(t, mo, ma, a, p);
        merce = me;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Merce: " + merce);
    }
}
