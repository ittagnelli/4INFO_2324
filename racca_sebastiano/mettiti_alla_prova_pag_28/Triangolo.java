public class Triangolo {
    private int[] lati;
    private int altezza;
    private int tipo;
    private double area;
    private double perimetro;

    private final int EQUILATERO = 0;
    private final int ISOSCELE = 1;
    private final int RETTANGOLO = 2;
    private final int SCALENO = 3;

    public Triangolo(int[] valoriLati, int valAltezza){
        lati = valoriLati;
        altezza = valAltezza;
        area = calculateArea();
        perimetro = calculatePerimetro();
        tipo = calculateTipo();
    }

    private double calculateArea() {
        return (double) (lati[2] * altezza)/2;
    }

    private double calculatePerimetro() {
        return lati[0] + lati[1] + lati[2];
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }


    private int calculateTipo() {
        if (lati[0] == lati[1] && lati[1] == lati[2])
            return EQUILATERO;

        else if (lati[0] == lati[1] || lati[1] == lati[2] || lati[0] == lati[2])
            return ISOSCELE;

        else if(lati[0] * lati[0] + lati[1] * lati[1] == lati[2] * lati[2])
            return RETTANGOLO;

        else 
            return SCALENO;
    }

    public String getTipo() {
        switch (tipo) {
            case EQUILATERO:
                return "Equilatero";
            
            case ISOSCELE:
                return "Isoscele";

            case RETTANGOLO:
                return "Rettangolo";

            case SCALENO:
                return "Scaleno";

            default:
                return "";
        }
    }

    public String toString() {
        return "Lato 1: " + lati[0] + "\nLato 2: ";
    }
}
