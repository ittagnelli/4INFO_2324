public class Rettangolo {
    private float base, altezza;

    public Rettangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getPerimetro() {
        return (base * 2) + (altezza * 2);
    }

    public float getArea() {
        return base * altezza;
    }

    public String toString() {
        return "Perimetro: " + getPerimetro() + "\nArea: " + getArea();
    }
}