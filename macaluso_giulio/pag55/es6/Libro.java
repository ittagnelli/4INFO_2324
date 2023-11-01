public class Libro {
    private String autore;
    private String titolo;
    private int pagine;

    Libro(String a, String t, int p) {
        autore = a;
        titolo = t;
        pagine = p;
    }

    public String getAutore() {
        return autore;
    }
    public String getTitolo() {
        return titolo;
    }
    public int getPagine() {
        return pagine;
    }

    public void setAutore(String a) {
        autore = a;
    }
    public void setTitolo(String t) {
        titolo = t;
    }
    public void setPagine(int p) {
        pagine = p;
    }
}
