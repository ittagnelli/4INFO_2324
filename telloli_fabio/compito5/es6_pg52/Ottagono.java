package es6_pg52;

public class Ottagono extends Poligono{
    protected double apotema;


    public Ottagono(int lunghezza) {
        super(8, lunghezza);
        apotema = lunghezza * 1.2071;
    }

    public double calcolaArea() {
        return 2 * lunghezza * apotema;
    }

}
