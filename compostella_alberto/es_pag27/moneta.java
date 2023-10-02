import java.util.Random;

public class Moneta {
    private int faccia;
    private int testa = 0;
    private int croce = 1;

    public Moneta() {
        lancia();
    }
    public void lancia() {
        faccia = (int) (Math.random() * 2);
    }
    public boolean isTesta() {
        return (faccia == testa);
    }
    public String toString() {
        String nomeFaccia;
        if(faccia == testa){
            nomeFaccia = "Testa";
        }else {
            nomeFaccia = "Croce";
        }
        return nomeFaccia;
    }
}
