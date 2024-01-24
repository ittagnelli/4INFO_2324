public class Libreria {
    private int len;
    private Libro[] elenco;
    private int temp;
    private String tempo;

    Libreria(Libro[] e, int l) {
        elenco = e;
        len = l;
    }

    public void stampa() {
        for(int i = 0; i < len; i ++) {
            System.out.println("\n" + elenco[i].getAutore());
            System.out.println("" + elenco[i].getTitolo());
            System.out.println("" + elenco[i].getPagine());
        }
    }
    public boolean controlloAutore(String nome) {
        for(int i = 0; i < len; i ++) {
            if(elenco[i].getAutore() == nome) {
                return true;
            }
        }
        return false;
    }
    public void cancella(int n) {
        elenco[n].setAutore("");
        elenco[n].setTitolo("");
        elenco[n].setPagine(0);
    }
    public void ordina() {
        for(int i = 0; i < len-1; i++) {
            for(int j = 0; j < len-i-1; j++) {
                if(elenco[j].getPagine() > elenco[j + 1].getPagine()) {
                    temp = elenco[j].getPagine();
                    elenco[j].setPagine(elenco[j + 1].getPagine());
                    elenco[j+1].setPagine(temp);

                    tempo = elenco[j].getAutore();
                    elenco[j].setAutore(elenco[j + 1].getAutore());
                    elenco[j + 1].setAutore(tempo);

                    tempo = elenco[j].getTitolo();
                    elenco[j].setTitolo(elenco[j + 1].getTitolo());
                    elenco[j + 1].setTitolo(tempo);
                }
            }
        }
    }
}
