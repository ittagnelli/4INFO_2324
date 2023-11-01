public class ProvaPianoforte {
    public static void main(String[] args){
        Pianoforte piano = new Pianoforte();
        piano.setSuono("dodomire");
        piano.suona();
        System.out.println(piano.getTipo());
    }
}
