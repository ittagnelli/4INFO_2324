public class MezzoProva {
    public static void main(String[] args) {
        MezzoTrasporto mezzo = new MezzoTrasporto();
        mezzo.setNumeroRuote(4);
        System.out.println(mezzo);

        Automobile automobile = new Automobile();
        automobile.setNumeroRuote(4);
        automobile.setMarca("Ford");
        System.out.println(automobile);

        Citycar city = new Citycar();
        city.setNumeroRuote(4);
        city.setMarca("Ford");
        city.setColore("Turchese");
        System.out.println(city);
    }
}
