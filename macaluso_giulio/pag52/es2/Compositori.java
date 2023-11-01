public class Compositori extends Musicisti{
    private String spartito;

    public void setSpartito(String s) {
        spartito = s;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.print("\nHa composto: " + spartito);
    }
}
