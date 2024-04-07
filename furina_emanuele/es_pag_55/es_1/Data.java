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
        if (giorno < giorniNelMese(mese, anno)) {
            giorno++;
        } else {
            giorno = 1;
            if (mese < 12) {
                mese++;
            } else {
                mese = 1;
                anno++;
            }
        }
    }

    public void nextMonth() {
        if (mese < 12) {
            mese++;
        } else {
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
            giorni += giorniNelMese(i, anno);
        }
        return giorni;
    }

    public int giorniAFineAnno() {
        int giorni = giorniNelMese(mese, anno) - giorno;
        for (int i = mese + 1; i <= 12; i++) {
            giorni += giorniNelMese(i, anno);
        }
        return giorni;
    }

    private int giorniNelMese(int mese, int anno) {
        int[] giorniPerMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mese == 2 && isAnnoBisestile(anno)) {
            return 29;
        }

        return giorniPerMese[mese];
    }

    private boolean isAnnoBisestile(int anno) {
        return (anno % 400 == 0) || ((anno % 4 == 0) && (anno % 100 != 0));
    }
}
