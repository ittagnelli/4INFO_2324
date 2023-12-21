public class racca_Docente extends racca_Dipendente {
    private String materia;

    racca_Docente(String nome, String cognome, String materia) {
        super(nome, cognome, "Docente");
        this.materia = materia;
    }

    public String getMateria() {
	    return this.materia;
    }

    public String toString() {
	    return super.toString() + "\nMateria: " + this.materia;
    }
}
