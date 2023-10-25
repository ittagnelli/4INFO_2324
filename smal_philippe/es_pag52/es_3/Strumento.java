public class Strumento {
    protected float costo;

    public void setCosto(float costo_enter) {
        costo = costo_enter;
    }

    public float getCosto() {
        return costo;
    }

    public String toString() {
        return "\nCosto: " + costo + "euro";
    }
}