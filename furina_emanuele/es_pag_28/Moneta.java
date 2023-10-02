import java.util.Random;
public class Moneta{
    private final int TESTA = 0;
    private final int CROCE = 1;
    private int faccia;
    public Moneta(){

        lancia();
    }

    public void lancia(){
        faccia = (int)(Math.random() * 2);
    }

    public boolean isTesta(){
        return (faccia == TESTA);
    }

    public String toString(){
        String nomeFaccia;
        if (faccia == TESTA)
            nomeFaccia = "Testa";
        else
            nomeFaccia = "Croce";
        return nomeFaccia;
    }
}
