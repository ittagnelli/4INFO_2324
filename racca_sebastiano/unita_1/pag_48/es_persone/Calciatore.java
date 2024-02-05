public class Calciatore extends Sportivo {
    private String squadra;
    private String ruolo;

    public Calciatore(
        String nome,
        String cognome,
        String squadra,
        String ruolo
        ) {
            super(nome, cognome, "Calcio");
            this.squadra = squadra;
            this.ruolo = ruolo;
    }

    public String toString() {
        return super.toString() + "\nSquadra: " + squadra + "\nRuolo: " + ruolo;
    }
}
