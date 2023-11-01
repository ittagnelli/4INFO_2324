public class Citycar extends Automobile{
    private double dimensioni;

    public void setDimensioni(double d) {
        dimensioni = d;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Dimensioni: " + dimensioni);
    }
}
