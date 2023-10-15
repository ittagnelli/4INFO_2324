public class MusicistiProva {
    public static void main(String[] args) {
        Musicisti musicista = new Musicisti();
        musicista.setNome("Pookie");
        System.out.println(musicista);

        Compositori compositore = new Compositori();
        compositore.setNome("Pookie");
        compositore.setComposizione("Rondo della tuca");
        System.out.println(compositore);

        Cantanti cantante = new Cantanti();
        cantante.setNome("Pookie");
        cantante.setComposizione("Rondo della tuca");
        cantante.setCanzone("perde terreno");
        System.out.println(cantante);
    }
}
