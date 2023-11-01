public class Geometria{
    private double lato1;
    private double lato2;
    private double lato3;
    private double lato4;
    private double lato5;
    private double lato6;
    private double lato7;
    private double lato8;
    private double area;
    private double perimetro;
    private double apo;

    public Geometria(double l1, double l2) {
        lato1 = l1;
        lato2 = l2;
    }

    public Geometria(double l1, double l2, double l3) {
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
    }

    public Geometria(double l1, double l2, double l3, double l4, double l5, double l6, double l7, double l8, double a) {
        lato1 = l1;
        lato2 = l2;
        lato3 = l3;
        lato4 = l4;
        lato5 = l5;
        lato6 = l6;
        lato7 = l7;
        lato8 = l8;
        apo = a;
    }

    public double calcolaAreaRettangolo() {
        area = lato1 * lato2;
        return area;
    }

    public double calcolaAreaTriangolo() {
        area = (lato1 * lato2) / 2;
        return area;
    }

    public double calcolaAreaOttagono() {
        area = perimetro * apo / 2;
        return area;
    }

    public double calcolaPerimetroRettangolo() {
        perimetro = (lato1 + lato2) * 2;
        return perimetro;
    }

    public double calcolaPerimetroTriangolo() {
        perimetro = lato1 + lato2 + lato3;
        return perimetro;
    }

    public double calcolaPerimetroOttagono() {
        perimetro = lato1 + lato2 + lato3 + lato4 + lato5 + lato6 + lato7 + lato8;
        return perimetro;
    }

    public void stampa() {
        System.out.println("\narea: " + area);
        System.out.println("perimetro: " + perimetro);
    }
}
