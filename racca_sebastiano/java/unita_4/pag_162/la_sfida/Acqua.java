public class Acqua <T> {
    private T contenuto;

    Acqua(T contenuto) {
        this.contenuto = contenuto;
    }
    
    @Override
    public String toString() {
        return "acqua " + contenuto.toString();
    }
}
