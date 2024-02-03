public class Data {
    private int giorno;
    private int mese;
    private int anno;

    public Data(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public void nextDay() {
        giorno++;
        if (giorno > giorniInMese(mese, anno)) {
            giorno = 1;
            nextMonth();
        }
    }

    public void nextMonth() {
        mese++;
        if (mese > 12) {
            mese = 1;
            anno++;
        }
    }

    public boolean isEqual(Data date) {
        return this.giorno == date.giorno && this.mese == date.mese && this.anno == date.anno;
    }

    public int giorniDaInizioAnno() {
        int giorni = giorno;
        for (int i = 1; i < mese; i++) {
            giorni += giorniInMese(i, anno);
        }
        return giorni;
    }

    public int giorniAFineAnno() {
        int giorni = giorniInMese(mese, anno) - giorno;
        for (int i = mese + 1; i <= 12; i++) {
            giorni += giorniInMese(i, anno);
        }
        return giorni;
    }

    private int giorniInMese(int mese, int anno) {
        int[] giorniPerMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mese == 2 && isAnnoBisestile(anno)) {
            return 29;
        }
        return giorniPerMese[mese];
    }

    private boolean isAnnoBisestile(int anno) {
        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}
