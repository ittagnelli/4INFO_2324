public class Succo <T> {
    private T contenuto;

    Succo(T contenuto) {
        this.contenuto = contenuto;
    }
    
    @Override
    public String toString() {
        return "succo alla " + contenuto.toString();
    }
}
