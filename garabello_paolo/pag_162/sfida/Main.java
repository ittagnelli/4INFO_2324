public class Main {
    public static void main(String[] args) {

        DIstributoreMerenda merenda;
        merenda = new DIstributoreMerenda("panino");
        merenda.merendapresa(new Panino<Prosciutto>(new Prosciutto()));
        merenda.merendapresa(new Panino<Cioccolato>(new Cioccolato()));

        merenda = new DIstributoreMerenda("focaccia");
        merenda.merendapresa(new Focaccia<Liscia>(new Liscia()));
        merenda.merendapresa(new Focaccia<Farcita>(new Farcita()));

        merenda = new DIstributoreMerenda("acqua");
        merenda.merendapresa(new Acqua<Liscia>(new Liscia()));
        merenda.merendapresa(new Acqua<Frizzante>(new Frizzante())); 

        merenda = new DIstributoreMerenda("Succo");
        merenda.merendapresa(new Succo<Pera>(new Pera()));
        merenda.merendapresa(new Succo<Mela>(new Mela()));
        merenda.merendapresa(new Succo<Albicocca>(new Albicocca()));
    }
}
