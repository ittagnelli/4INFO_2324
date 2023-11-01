class Auto {
    private String modello;
    private String marca;
    private int anno;

    public Auto(String targa, String modello, String marca, int anno) {
        this.modello = modello;
        this.marca = marca;
        this.anno = anno;
    }

    public void stampa() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Anno: " + anno);
    }
}
