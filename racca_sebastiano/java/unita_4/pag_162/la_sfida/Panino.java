public class Panino <T> {
    private T contenuto;

    Panino(T contenuto) {
        this.contenuto = contenuto;
    }
    
    @Override
    public String toString() {
        return "panino al " + contenuto.toString();
    }
}
