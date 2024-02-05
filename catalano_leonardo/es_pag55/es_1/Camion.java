public class Camion extends AutoMezzo{
    private String merce;

    Camion(String tar, String mod, int an, int por, String mar, String mer) {
        super(tar, mod, mar, an, por);
        merce = mer;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Merce: " + merce);
    }
}
