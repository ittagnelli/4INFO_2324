package compito3.es_5;

public class Automobile extends MezzoDiTrasporto {
    private int porte;

    public Automobile(String marca, String modello, int anno, int nport) {
        super(marca, modello, anno);
        nport = porte;
    }
}
