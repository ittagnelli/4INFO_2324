public class Lampadina {

    private final int SPENTA = 0;
    private final int ACCESA = 1;
    private final int ROTTA = 2;
    private int max;
    private int clicked;
    private int status;    

    public Lampadina(int maxClick){
        max = maxClick;
        clicked = 0;
        status = SPENTA;
    }

    public void click(){
        clicked++;
        if(clicked >= max){
            status = ROTTA;
        } else{
            if(status == ACCESA)
                status = SPENTA;
            else
                status = ACCESA;
        }
    }
    public String toString(){
        return status == SPENTA ? "spenta" : status == ACCESA ? "accesa" : "rotta";
    }
}
