class MezzoDiTrasporto {
    String nome;

    public MezzoDiTrasporto(String nome) {
        this.nome = nome;
    }

    public void viaggia() {
        System.out.println(nome + " sta viaggiando.");
    }
}

class Automobile extends MezzoDiTrasporto {
    public Automobile(String nome) {
        super(nome);
    }

    public void accelera() {
        System.out.println(nome + " accelera.");
    }
}

class CityCar extends Automobile {
    public CityCar(String nome) {
        super(nome);
    }

    public void parcheggia() {
        System.out.println(nome + " parcheggia.");
    }
}

public class TestAutomobile {
    public static void main(String[] args) {
        Automobile auto = new Automobile("Ferrari f40");
        CityCar cityCar = new CityCar("Fiat 500");

        auto.viaggia();
        auto.accelera();

        cityCar.viaggia();
        cityCar.accelera();
        cityCar.parcheggia();
    }
}
