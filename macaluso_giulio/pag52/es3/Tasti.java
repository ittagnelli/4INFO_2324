public class Tasti extends Strumento{
    private int numero;

    public void setNumero(int n) {
        numero = n;
    }
    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Numero tasti: " + numero);
    }
}
