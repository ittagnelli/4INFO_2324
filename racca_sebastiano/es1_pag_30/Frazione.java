public class Frazione {
    private float den;
    private float num;

    public Frazione(float denominatore, float numeratore) {
        den = denominatore;
        num = numeratore;

        if(!isValid()) {
            System.out.println("La frazione non esiste.");
            System.exit(1);
        }
        
    }

    private boolean isValid() {
        return den != 0;
    }


    public float getValue() {
        return num/den;
    }

}