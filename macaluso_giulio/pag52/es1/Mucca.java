public class Mucca extends Terrestre {
    protected int figli;

    public void setFigli(int f) {
        figli = f;
    }
    public int getFigli() {
        return figli;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("numero figli: " + figli);
    }
}
