class Geometria {
    public double calcolaArea() {
        return 0.0;
    }

    public double calcolaPerimetro() {
        return 0.0;
    }
}

class Poligono extends Geometria {
    private int numLati;
    private double lunghezzaLati;

    public Poligono(int numLati, double lunghezzaLati) {
        this.numLati = numLati;
        this.lunghezzaLati = lunghezzaLati;
    }

    @Override
    public double calcolaArea() {
        return 0.0;
    }

    @Override
    public double calcolaPerimetro() {
        return 0.0;
    }
}

class Ottagono extends Poligono {
    public Ottagono(double lunghezzaLati) {
        super(8, lunghezzaLati);
    }

    @Override
    public double calcolaArea() {
        return 2 * lunghezzaLati * lunghezzaLati * Math.tan(Math.PI / 8);
    }

    @Override
    public double calcolaPerimetro() {
        return numLati * lunghezzaLati;
    }
}

class Quadrato extends Poligono {
    public Quadrato(double lato) {
        super(4, lato);
    }

    @Override
    public double calcolaArea() {
        return lunghezzaLati * lunghezzaLati;
    }

    @Override
    public double calcolaPerimetro() {
        return numLati * lunghezzaLati;
    }
}

class Rettangolo extends Poligono {
    private double lunghezzaBase;

    public Rettangolo(double lunghezzaBase, double altezza) {
        super(4, 0.0);
        this.lunghezzaBase = lunghezzaBase;
        this.lunghezzaLati = altezza;
    }

    @Override
    public double calcolaArea() {
        return lunghezzaBase * lunghezzaLati;
    }

    @Override
    public double calcolaPerimetro() {
        return 2 * (lunghezzaBase + lunghezzaLati);
    }
}

public class Main {
    public static void main(String[] args) {
        Ottagono ottagono = new Ottagono(5.0);
        Quadrato quadrato = new Quadrato(4.0);
        Rettangolo rettangolo = new Rettangolo(6.0, 4.0);

        System.out.println("Area e Perimetro dell'Ottagono:");
        System.out.println("Area: " + ottagono.calcolaArea());
        System.out.println("Perimetro: " + ottagono.calcolaPerimetro());

        System.out.println("Area e Perimetro del Quadrato:");
        System.out.println("Area: " + quadrato.calcolaArea());
        System.out.println("Perimetro: " + quadrato.calcolaPerimetro());

        System.out.println("Area e Perimetro del Rettangolo:");
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
    }
}
