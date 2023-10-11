public class Moneta{
    private int faccia;
    private int CROCE=1;
    private int TESTA=0;
}

public Moneta(){
    lancia();
}

public void lancia(){
    faccia = (int) (Math.random() * 2);
}

public boolean isTesta(){
    return (faccia=TESTA);
}

public String toString(){
    String nomeFaccia;
    if (faccia==TESTA) {
        nomeFaccia = "Testa";
    } else {
        nomeFaccia = "Croce";
        return nomeFaccia;
    }
}
