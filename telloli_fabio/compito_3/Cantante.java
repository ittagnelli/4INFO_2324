public class Cantante extends Persona {
    private String genere;

    public Cantante(String nome, String gen) {
        super(nome);
        gen = genere;
    }

    public void canta() {
        System.out.println("Canatante:" + getNome() + " genere:" + genere);
    }
}
