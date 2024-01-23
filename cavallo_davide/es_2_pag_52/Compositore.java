public class Compositore {
    String nome;

    public Compositore(String nomeCompositore) {
        nome = nomeCompositore;
    }

    public void componi() {
        System.out.println(nome + " sta componendo una nuova musica.");
    }
}
