class MezzoDiTrasporto {
    protected String marca;
    protected int annoDiProduzione;

    public MezzoDiTrasporto(String marca, int annoDiProduzione) {
        this.marca = marca;
        this.annoDiProduzione = annoDiProduzione;
    }
    
    public void muovi() {
        System.out.println("Il mezzo di trasporto si sta muovendo.");
    }
}

class Bicicletta extends MezzoDiTrasporto {
    private int numeroMarce;
    
    public Bicicletta(String marca, int annoDiProduzione, int numeroMarce) {
        super(marca, annoDiProduzione);
        this.numeroMarce = numeroMarce;
    }

    public void pedala() {
        System.out.println("La bicicletta sta pedalando.");
    }
}

public class TestBicicletta {
    public static void main(String[] args) {
        Bicicletta bicicletta1 = new Bicicletta("Trek", 2021, 21);
        Bicicletta bicicletta2 = new Bicicletta("Giant", 2020, 18);

        bicicletta1.muovi();
        bicicletta1.pedala();

        bicicletta2.muovi();
        bicicletta2.pedala();
    }
}
