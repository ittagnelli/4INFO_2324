public class Data {
    private int giorno, mese, anno;

    Data(int g, int m, int a) {
        giorno = g;
        mese = m;
        anno = a;
    }

    public int getDay() {
        return giorno;
    }
    public int getMonth() {
        return mese;
    }
    public int getYear() {
        return anno;
    }

    public void setDay(int g) {
        giorno = g;
    }

    public void setMonth(int m) {
        mese = m;
    }

    public void nextDay() {
        setDay(giorno + 1);
    }

    public void nextMonth() {
        setMonth(mese + 1);
    }

    public boolean isEqual(Data date) {
        return ((giorno == date.getDay()) && (mese == date.getMonth()) && (anno == date.getYear()));
    }
    
    public int giorniDaInizioAnno() {
        return (30 * (mese - 1) + giorno);
    }

    public int giorniAFineAnno() {
        return 365 - giorniDaInizioAnno();
    }

    public void stampa() {
        System.out.println("\nGiorno: " + giorno);
        System.out.println("Mese: " + mese);
        System.out.println("Anno: " + anno);
    }
}
