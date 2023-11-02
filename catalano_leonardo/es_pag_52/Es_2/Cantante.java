public class Cantante extends Persona {
    String genereMusicale;

    public Cantante(String nome, int eta, String genereMusicale) {
        super(nome, eta);
        this.genereMusicale = genereMusicale;
    }

    void esibizione() {
        System.out.println("Cantante " + nome + " in esibizione!");
    }
}
