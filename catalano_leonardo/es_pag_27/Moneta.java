import java.util.Random;

public class Moneta {
    private final int TESTA = 0;
    private final int CROCE = 1;
    private int faccia;

    public Moneta() {
        LancioMoneta();
    }

    public void LancioMoneta() {
        faccia = (int) (Math.random() * 2);
    }

    public boolean isTesta() {
        return (faccia == TESTA);
    }

    public String toString() {
        String nomeFaccia;
        if (faccia == TESTA)
            nomeFaccia = "testa";
        else
            nomeFaccia = "croce";
        return nomeFaccia;

    }

}
