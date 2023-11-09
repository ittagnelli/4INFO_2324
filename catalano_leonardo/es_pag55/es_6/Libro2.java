public class Libro2 {
private String titolo;
    private String autore;
    private int pagine;

    Libro2(String aut, String tit, int pag) {
        autore = aut;
        pagine = pag;
        titolo = tit;

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

    public void setPagine(int pag) {
        pagine = pag;
    }

    public void setTitolo(String tit) {
        titolo = tit;
    }

    public void setAutore(String aut) {
        autore = aut;
    }

}