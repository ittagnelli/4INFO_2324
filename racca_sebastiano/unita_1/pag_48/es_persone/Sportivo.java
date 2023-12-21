public class Sportivo extends Persona {
    private String sport;

    Sportivo(String nome, String cognome, String sport) {
        super(nome, cognome);
        this.sport = sport;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSport: " + sport;
    }
}
