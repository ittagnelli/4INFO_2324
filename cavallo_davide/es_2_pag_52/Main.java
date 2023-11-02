public class Main {
    public static void main(String[] args) {
        Cantante cantante = new Cantante("Adele", "pop");
        Musicista musicista = new Musicista("John", "pianoforte");
        Compositore compositore = new Compositore("Mozart");

        cantante.esegui();
        musicista.esegui(); 
        compositore.componi(); 
    }
}
