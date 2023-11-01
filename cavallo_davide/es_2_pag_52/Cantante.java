public class Cantante {
    String nome;
    String genereMusicale;

    public Cantante(String nomeCantante, String genere) {
        nome = nomeCantante;
        genereMusicale = genere;
    }

    public void esegui() {
        System.out.println(nome + " sta cantando " + genereMusicale + ".");
    }
}
