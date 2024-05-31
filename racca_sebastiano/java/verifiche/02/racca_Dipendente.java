public class racca_Dipendente extends racca_Persona {
    private String mansione;

    racca_Dipendente(String nome, String cognome, String mansione) {
        super(nome, cognome);
        this.mansione = mansione;
    }

    public String getMansione() {
	    return this.mansione;
    }

    public String toString() {
	    return super.toString() + "\nMansione: " + this.mansione;
    }
}
