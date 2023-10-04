public class triangolo {
    private double lato;
    private double base;
    private double altezza;
    private double perimetro;
    private double area;

    public triangolo() {
        lato = 0;
        base = 0;
        altezza = 0;
    }

    public void setLato(double x) {
        lato = x;
    }
    public void setBase(double x) {
        base = x;
    }
    public void setAltezza(double x) {
        altezza = x;
    }

    public double getLato() {
        return lato;
    }
    public double getbase() {
        return base;
    }
    public double getAltezza() {
        return altezza;
    }

    public void calcolaPerimetro() {
        perimetro = base + altezza + lato;
    }
    public void calcolaArea() {
        area = (base * altezza) / 2;
    }
    public void stampa() {
        System.out.println("area: " + area);
        System.out.print("perimetro: " + perimetro);
    }

    public void formaTriangolo() {
        if((lato == altezza) && (lato == base)) {
            System.out.println("\nIl triangolo è equilatero\n");
        } else if((lato != altezza) && (lato != base) && (base != altezza)) {
            System.out.println("\nIl triangolo è scaleno\n");
        } else {
            System.out.println("\nIl triangolo è isoscele\n");
        }
    }
}
