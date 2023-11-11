public class Auto {
    private String targa;
    private String modello;
    private String marca;
    private int anno;

    Auto(String t, String mo, String ma, int a) {
        targa = t;
        modello = mo;
        marca = ma;
        anno = a;
    }

    public void stampa() {
        System.out.println("\nMarca: " + marca);
        System.out.println("Modello: " + modello);
        System.out.println("Targa: " + targa);
        System.out.println("Anno: " + anno);
    }
}
