public class Bicicletta extends Mezzo {
    public String colore;

    public Bicicletta(int num_ruote_enter, String colore_enter) {
        super(num_ruote_enter);
        colore = colore_enter;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncolore : " + colore;
    }
}
