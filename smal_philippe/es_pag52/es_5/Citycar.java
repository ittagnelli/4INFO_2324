public class Citycar extends Automobile{
    protected String colore;

    public void setColore(String colore_enter) {
        colore = colore_enter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore: " + colore;
    }
}

