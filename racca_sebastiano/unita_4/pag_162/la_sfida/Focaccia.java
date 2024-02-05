public class Focaccia <T> {
    private T contenuto;

    Focaccia(T contenuto) {
        this.contenuto = contenuto;
    }
    
    @Override
    public String toString() {
        return "focaccia " + contenuto.toString();
    }
}
