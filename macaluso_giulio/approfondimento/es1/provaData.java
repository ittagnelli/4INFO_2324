public class provaData {
    public static void main(String[] args) {
        Data d = new Data(14, 9, 2006);
        d.stampa();
        d.nextDay();
        d.nextMonth();
        d.stampa();
        Data data = new Data(15, 10, 2006);
        System.out.println("Data uguale: " + d.isEqual(data));
        System.out.println("\nGiorni da inizio anno: " + d.giorniDaInizioAnno());
        System.out.println("Giorni a fine anno: " + d.giorniAFineAnno());
    }
}
