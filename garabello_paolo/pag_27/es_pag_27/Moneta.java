public class Moneta {
    private int result;

    public Moneta(){
        lancia();
    }

    public void lancia(){  
        result = (int)(Math.random()*2);  
    }

    public int GiveResult(){
        return result;
    }

}
