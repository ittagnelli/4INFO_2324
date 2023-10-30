package es6_pg52;

public class Rettangolo extends Poligono {
    protected double larghezza;


    public Rettangolo(double lunghezza, double larg) {
        super(4, lunghezza);
        larg = larghezza;
    }

    public double calcolaArea() {
        return lunghezza * larghezza;
    }
}
