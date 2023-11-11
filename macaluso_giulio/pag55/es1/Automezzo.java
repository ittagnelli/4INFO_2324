public class Automezzo extends Auto{
    private int porte;

    Automezzo(String t, String mo, String ma, int a, int p) {
        super(t, mo, ma, a);
        porte = p;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Porte: " + porte);
    }
}
