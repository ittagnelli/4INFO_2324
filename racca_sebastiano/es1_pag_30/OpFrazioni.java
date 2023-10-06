public class OpFrazioni {
    private Frazione[] fr;

    public OpFrazioni(Frazione[] frazioni) {
        fr = frazioni;
    }

    public Frazione getFrazione(int index) {
        return fr[index];
    }

    public float somma() {
        float val = 0;
        for (Frazione frazione : fr) {
            val += frazione.getValue();
        }
        return val;
    }

    public float differenza() {
        float val = fr[0].getValue();
        for (int i = 1; i < fr.length; i++) {
            val -= fr[i].getValue();
        }
        return val;
    }

    public float prodotto() {
        float val = 1;
        for (Frazione frazione : fr) {
            val *= frazione.getValue();
        }
        return val;
    }
}
