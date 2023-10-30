public class Mammifero extends Animale {
    int numeroZampe;

    public Mammifero(String nome, int numeroZampe) {
        nome = nome;
        numeroZampe = numeroZampe;
    }

    public void allatta() {
        System.out.println("Il mammifero allatta i suoi cuccioli.");
    }
}
