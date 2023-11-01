public class    ProvaCellulare {
    public static void main(String[] args) {
        Cellulare cellulare = new Cellulare("Samsung", "Galaxy S20", "Android");
        cellulare.accendi();
        cellulare.chiamare();
        cellulare.inviareMessaggio();
        cellulare.spegni();

        Tablet tablet = new Tablet("Apple", "iPad Pro", "iOS");
        tablet.accendi();
        tablet.navigareInternet();
        tablet.guardareVideo();
        tablet.spegni();

        Frigorifero frigorifero = new Frigorifero("LG", "ModelloX", -16);
        frigorifero.accendi();
        frigorifero.raffreddare();
        frigorifero.scongelare();
        frigorifero.spegni();
    }
}
