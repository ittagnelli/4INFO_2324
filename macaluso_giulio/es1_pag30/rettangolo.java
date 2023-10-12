public class rettangolo{
    private double base;
    private double altezza;
    private double area;
    private double perimetro;
    
    public rettangolo() {
        altezza = 0;
        base = 0;
    }
    public void setBase(double x) {
        base = x;
    }
    public void setAltezza(double x) {
        altezza = x;
    }
    public double getBase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }

    public void calcolaArea() {
        area = base * altezza;
    }
    public void calcolaPerimetro() {
        perimetro = (base + altezza) * 2;
    }
    public void stampa() {
        System.out.print("\narea: " + area);
        System.out.print("\nperimetro: " + perimetro);
    }
}
