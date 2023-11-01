public class ProvaCantante {
    public static void main(String[] args) {
        Cantante cantante = new Cantante("William", 28, "Rap");
        cantante.saluta();
        cantante.esibizione();

        Musicista musicista = new Musicista("John ", 34, "Chitarra");
        musicista.saluta();
        musicista.suona();

        Compositore compositore = new Compositore("Cicco", 51, "Pianoforte", "Colonna sonora");
        compositore.saluta();
        compositore.suona();
        compositore.compone();
    }
}
