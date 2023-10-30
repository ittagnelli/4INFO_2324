public class Quadrupede extends Mammifero {
    String tipoPelo;

    public Quadrupede(String nome, int numeroZampe, String tipoPelo) {
        nome = nome;
        numeroZampe = numeroZampe;
        tipoPelo = tipoPelo;
    }

    public void corre() {
        System.out.println("Il quadrupede sta correndo.");
    }
}
