public class Rettangolo {
    private int base;
    private int altezza;
    private int perimetro;
    private int area;

    public Rettangolo(int base, int altezza) {
        setBase(base);
        setAltezza(altezza);
        calcolaAreaEPerimetro();
    }

    public void setBase(int base) {
        this.base = base;
        calcolaAreaEPerimetro();
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
        calcolaAreaEPerimetro();
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    private void calcolaAreaEPerimetro() {
        area = base * altezza;
        perimetro = 2 * (base + altezza);
    }

    public int getPerimetro() {
        return perimetro;
    }

    public int getArea() {
        return area;
    }
}