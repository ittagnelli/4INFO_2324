public class OpFrazioni {
    private Frazione[] frazioni;

    public OpFrazioni(Frazione[] frazioni) {
        this.frazioni = frazioni;
    }

    public Frazione getFrazione(int index) {
        return frazioni[index];
    }

    public float somma() {
        float val = 0;
        for (Frazione frazione : frazioni) {
            val += frazione.getValue();
        }
        return val;
    }

    public float differenza() {
        float val = frazioni[0].getValue();
        for (int i = 1; i < frazioni.length; i++) {
            val -= frazioni[i].getValue();
        }
        return val;
    }

    public float prodotto() {
        float val = 1;
        for (Frazione frazione : frazioni) {
            val *= frazione.getValue();
        }
        return val;
    }
}
