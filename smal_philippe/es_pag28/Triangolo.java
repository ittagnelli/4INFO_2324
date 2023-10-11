public class Triangolo {
    private int perimetro;
    private int area;
    private int lato;
    private int base;
    private int altezza;

    public Triangolo() {
        lato = 0;
        base = 0;
        altezza = 0;
    }

    public void setLato(int value) {
        lato = value;
    }

    public void setBase(int value) {
        base = value;
    }

    public void setAltezza(int value) {
        altezza = value;
    }

    public int getLato() {
        return lato;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void calcolaPerimetro() {
        perimetro = altezza + base + lato;
    }

    public void calcolaArea() {
        area = (altezza * base)/ 2;
    }

    public void riconosciTriangolo() {
        if((lato == base) && (base == altezza)) {
            System.out.println("Triangolo : equilatero ");
        } else if((lato != base) && (base != altezza) && (lato != altezza)) {
            System.out.println("Triangolo : isociele ");
        } else if(((lato == base) && (base != altezza)) ||
                    ((altezza == base) && (lato != altezza)) || 
                    ((lato == altezza) && (base != lato))) {
            System.out.println("Triangolo : scaleno ");
        }
    }

    public void stampa() {
        System.out.println("Area : " + area);
        System.out.println("Perimetro : " + perimetro);
    }



}
