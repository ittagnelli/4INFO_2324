public class Automobile extends Mezzo{
    private double costo;

    public void setCosto(double c) {
        costo = c;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("\nIl costo è: " + costo);
    }
}
