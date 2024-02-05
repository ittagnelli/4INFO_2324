public class Auto {
    private String targa;
    private String modello;
    private String marca;
    private int anno;

    Auto(String tar, String mod, String mar, int an) {
        targa = tar;
        anno = an;
        modello = mod;
        marca = mar;
       
    }

    public void stampa() {
        System.out.println("Marca: " + marca);
        System.out.println("Anno: " + anno);
        System.out.println("Modello: " + modello);
        System.out.println("Targa: " + targa);
       
    }
}
