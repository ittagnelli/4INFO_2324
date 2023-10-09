public class Frazione {
    private float den;
    private float num;

    public Frazione(float numeratore, float denominatore) {
        num = numeratore;
        den = denominatore;
        if (den == 0) {
            System.out.println("La frazione è impossibile");
        }
    }

    public float getValue() {
        return num / den;
    }
}
