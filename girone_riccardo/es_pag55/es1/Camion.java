class Camion extends Automezzo {
    private String merce;

    public Camion(String modello, String marca, int anno, int porte, String merce) {
        super(modello, marca, anno, porte);
        this.merce = merce;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Merce: " + merce);
    }
}
