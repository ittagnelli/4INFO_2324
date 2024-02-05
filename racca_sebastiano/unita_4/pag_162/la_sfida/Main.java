public class Main {
    public static void main(String[] args) {
        (new DistributoreMerenda<Panino<Cioccolato>>()).prendiMerenda(new Panino<Cioccolato>(new Cioccolato()));
        (new DistributoreMerenda<Acqua<Frizzante>>()).prendiMerenda(new Acqua<Frizzante>(new Frizzante()));
        (new DistributoreMerenda<Acqua<Liscia>>()).prendiMerenda(new Acqua<Liscia>(new Liscia()));
        (new DistributoreMerenda<Focaccia<Liscia>>()).prendiMerenda(new Focaccia<Liscia>(new Liscia()));
        (new DistributoreMerenda<Focaccia<Farcita>>()).prendiMerenda(new Focaccia<Farcita>(new Farcita()));
        (new DistributoreMerenda<Succo<Pera>>()).prendiMerenda(new Succo<Pera>(new Pera()));
        (new DistributoreMerenda<Succo<Mela>>()).prendiMerenda(new Succo<Mela>(new Mela()));
        (new DistributoreMerenda<Succo<Albicocca>>()).prendiMerenda(new Succo<Albicocca>(new Albicocca()));
    }
}
