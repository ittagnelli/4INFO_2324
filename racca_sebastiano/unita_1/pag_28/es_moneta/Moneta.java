public class Moneta {
    private final int TESTA = 0;
    private final int CROCE = 1;
    private int faccia;

    public void lancia() {
        faccia = (int) (Math.random() * 2);
    }

    public boolean isTesta() {
        return faccia == TESTA;
    }

    public boolean isCroce() {
        return faccia == CROCE;
    }

    public String toString() {
        return faccia == TESTA ? "testa" : "croce";
    }
}
