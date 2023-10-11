public class Lampadina {

    private int stato; //spenta = 0, accesa = 1, rotta = 2
    private int contatore;

    public Lampadina() {
        stato = 0;
        contatore = 0;
    }

    public boolean click() {
        if(stato == 0) {
            stato = 1;
        } else if(stato == 1) {
            stato = 0;
        }

        contatore++;

        if(contatore == 8) {
            stato = 2;

            return false;
        } 
        
        return true;
        

    }

    public String toString() {

        if(stato == 0) {
            return "spenta";
        } else if(stato == 1) {
            return "accesa";
        } else {
            return "rotta";
        }
    }

}
