public class Mucca extends Quadrupede {
    String coloreMacchie;

    public Mucca(String nome, int numeroZampe, String tipoPelo, String coloreMacchie) {
        nome = nome;
        numeroZampe = numeroZampe;
        tipoPelo = tipoPelo;
        coloreMacchie = coloreMacchie;
    }

    public void muggisce() {
        System.out.println("La mucca sta muggendo.");
    }
}
