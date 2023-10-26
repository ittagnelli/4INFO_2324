public class Cellulare extends Elettrodomestico{
    protected String marca;

    public void setMarca(String marca_enter) {
        marca = marca_enter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarca: " + marca;
    }
}
