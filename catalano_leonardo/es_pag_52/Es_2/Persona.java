public class Persona {
    String nome;
    int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    void saluta() {
        System.out.println(" sono " + nome);
    }
}
