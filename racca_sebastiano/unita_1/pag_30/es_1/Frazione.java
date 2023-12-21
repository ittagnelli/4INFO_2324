public class Frazione {
    private float denominatore;
    private float numeratore;

    public Frazione(float denominatore, float numeratore) {
        this.denominatore = denominatore;
        this.numeratore = numeratore;

        if(!isValid()) {
            System.out.println("La frazione non esiste.");
            System.exit(1);
        }
        
    }

    private boolean isValid() {
        return denominatore != 0;
    }


    public float getValue() {
        return numeratore/denominatore;
    }

}