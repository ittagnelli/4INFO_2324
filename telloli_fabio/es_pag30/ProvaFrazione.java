public class ProvaFrazione {
    
    public static void main(String[] args) {
        Frazione fraz = new Frazione(4, 5, 6, 7);
        
        fraz.CalcolaProdotto();

        int prodnum = fraz.getProdnum();
        int prodden = fraz.getProdden();

        System.out.println("il prodotto delle due frazioni e': "+ prodnum + "/" + prodden );


        fraz.CalcolaDifferenza();

        prodnum = fraz.getProdnum();
        prodden = fraz.getProdden();

        System.out.println("la differenza delle due frazioni e': "+ prodnum + "/" + prodden );


        fraz.CalcolaSomma();

        int denominatore = fraz.getDenominatore();
        float somma = fraz.getSomma();

        System.out.println("la somma delle due frazioni e': "+ somma + "/" + denominatore);
    }
}

