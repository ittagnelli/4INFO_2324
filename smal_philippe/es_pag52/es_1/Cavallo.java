public class Cavallo extends Terrestre {
    protected String colore;

    public void setColore(String colore_enter) {
        colore = colore_enter;
    }
    
    public String getColore() {
        return colore;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore : " + colore;
    }
}
