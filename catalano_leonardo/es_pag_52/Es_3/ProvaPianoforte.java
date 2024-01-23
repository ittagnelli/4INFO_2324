public class ProvaPianoforte {
    public static void main(String[] args) {
        Pianoforte pianoforte = new Pianoforte("Pianoforte", 88);
        pianoforte.suona();
        pianoforte.suonaNota();

        Chitarra chitarra = new Chitarra("Chitarra", 6);
        chitarra.suona();
        chitarra.pizzicaNota();

        Flauto flauto = new Flauto("Flauto", "Legno");
        flauto.suona();
        flauto.soffiaNota();
    }
}
