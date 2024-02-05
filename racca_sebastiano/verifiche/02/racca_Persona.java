public class racca_Persona {
    private String nome;
    private String cognome;

    racca_Persona(String nome, String cognome) {
        this.nome = nome;
	    this.cognome = cognome;
    }

    public String getNome() {
	    return this.nome;
    }

    public String getCognome() {
	    return this.cognome;
    }

    public String toString() {
	    return "Nome: " + this.nome + "\nCognome: " + this.cognome;
    }

    public void print() {
	    System.out.println(this.getClass() + ":\n------------\n" + this.toString());
    }

}
