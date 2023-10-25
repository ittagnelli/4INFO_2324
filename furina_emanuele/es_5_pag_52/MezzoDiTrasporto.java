class MezzoDiTrasporto {
    private String marca;
    private String modello;
    private int annoDiProduzione;

    public MezzoDiTrasporto(String marca, String modello, int annoDiProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoDiProduzione = annoDiProduzione;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnnoDiProduzione() {
        return annoDiProduzione;
    }

    public void avvia() {
        System.out.println("Il mezzo di trasporto di marca " + marca + " e modello " + modello + " è stato avviato.");
    }

    public void spegni() {
        System.out.println("Il mezzo di trasporto di marca " + marca + " e modello " + modello + " è stato spento.");
    }
}

class Automobile extends MezzoDiTrasporto {
    private int numeroPorte;

    public Automobile(String marca, String modello, int annoDiProduzione, int numeroPorte) {
        super(marca, modello, annoDiProduzione);
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void accelera() {
        System.out.println("L'automobile di marca " + getMarca() + " e modello " + getModello() +
                " sta accelerando.");
    }

    public void frenaNelParcheggio() {
        System.out.println("L'automobile di marca " + getMarca() + " e modello " + getModello() +
                " sta frenando nel parcheggio.");
    }
}

class CityCar extends Automobile {
    private String carburante;

    public CityCar(String marca, String modello, int annoDiProduzione, int numeroPorte, String carburante) {
        super(marca, modello, annoDiProduzione, numeroPorte);
        this.carburante = carburante;
    }

    public String getCarburante() {
        return carburante;
    }

    public void parcheggia() {
        System.out.println("La city car di marca " + getMarca() + " e modello " + getModello() +
                " sta parcheggiando in città.");
    }

    public void attivaClimatizzatore() {
        System.out.println("La city car di marca " + getMarca() + " e modello " + getModello() +
                " sta attivando il climatizzatore.");
    }
}

public class Main {
    public static void main(String[] args) {
        MezzoDiTrasporto bici = new MezzoDiTrasporto("QualcheMarcaCheNonConosco", "Qualcosa", 2022);
        Automobile auto = new Automobile("Toyota", "Corolla", 2023, 4);
        CityCar cityCar = new CityCar("Ford", "Fiesta", 2023, 3, "Benzina");

        bici.avvia();
        bici.spegni();

        auto.avvia();
        auto.accelera();
        auto.spegni();

        cityCar.avvia();
        cityCar.parcheggia();
        cityCar.attivaClimatizzatore();
        cityCar.spegni();
    }
}
