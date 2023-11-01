class Automezzo extends Auto {
    private int porte;

    public Automezzo(String modello, String marca, int anno, int porte) {
        super(modello, marca, anno);
        this.porte = porte;
    }

    @Override
    public void stampa() {
        super.stampa();
        System.out.println("Porte: " + porte);
    }
}
