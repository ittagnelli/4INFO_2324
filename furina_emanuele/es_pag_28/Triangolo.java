import java.util.Scanner;

class Triangolo {
    private double lato1;
    private double lato2;
    private double lato3;

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public String tipoTriangolo() {
        if (lato1 == lato2 && lato2 == lato3) {
            return "Equilatero";
        } else if (lato1 == lato2 || lato2 == lato3 || lato1 == lato3) {
            return "Isoscele";
        } else {
            return "Scaleno";
        }
    }

    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;
    }

    public double calcolaArea() {
        double s = calcolaPerimetro() / 2;
        return Math.sqrt(s * (s - lato1) * (s - lato2) * (s - lato3));
    }

    public double calcolaDiagonale() {
        if (lato1 == lato2 && lato2 == lato3) {
            return lato1 * Math.sqrt(3);
        } else {
            return -1;
        }
    }

    public void visualizzaRisultati() {
        System.out.println("Tipo di triangolo: " + tipoTriangolo());
        System.out.println("Perimetro: " + calcolaPerimetro());
        System.out.println("Area: " + calcolaArea());
        double diagonale = calcolaDiagonale();
        if (diagonale != -1) {
            System.out.println("Lunghezza diagonale: " + diagonale);
        } else {
            System.out.println("Diagonali non calcolabili per triangoli non equilateri.");
        }
    }
}
