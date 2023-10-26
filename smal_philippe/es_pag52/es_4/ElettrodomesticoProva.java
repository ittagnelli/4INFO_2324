public class ElettrodomesticoProva {
    public static void main(String[] args) {
        Elettrodomestico elettrodomestico = new Elettrodomestico();
        elettrodomestico.setVolt(300);
        System.out.println(elettrodomestico);

        Cellulare cellurare = new Cellulare();
        cellurare.setVolt(300);
        cellurare.setMarca("Xiomi");
        System.out.println(cellurare);
    }
}
