public class AutoMezzo extends Auto{
    private int porte;

    AutoMezzo(String tar, String mod, String mar, int an, int por) {
        super(tar, mod, mar, an);
        porte = por;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("porte " + porte);
    }
}
