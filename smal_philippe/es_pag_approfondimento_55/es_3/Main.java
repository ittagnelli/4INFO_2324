public class Main {
    public static void main(String[] args) {
        Alimentare alimentare = new Alimentare(31, 123456789, "pane carasao", 700);
        System.out.println(alimentare);
        alimentare.calcolaSconto(25);
        System.out.println(alimentare);

        NonAlimentare nonAlimentare = new NonAlimentare("carta", 123456788, "libro da colorare", 200);
        System.out.println(nonAlimentare);
        nonAlimentare.calcolaSconto(1);
        System.out.println(nonAlimentare);
    }
}
