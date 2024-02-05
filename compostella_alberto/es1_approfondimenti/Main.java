public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(6, 11, 2023);
        Data data2 = new Data(7, 11, 2023);

        System.out.println("Data 1: " + data1.giorno + "/" + data1.mese + "/" + data1.anno);
        System.out.println("Data 2: " + data2.giorno + "/" + data2.mese + "/" + data2.anno);

        data1.nextDay();
        System.out.println("Data 1 dopo nextDay(): " + data1.giorno + "/" + data1.mese + "/" + data1.anno);

        data2.nextMonth();
        System.out.println("Data 2 dopo nextMonth(): " + data2.giorno + "/" + data2.mese + "/" + data2.anno);

        boolean isEquals = data1.isEqual(data2);
        System.out.println("Data 1 è uguale a Data 2? " + isEquals);

        int giorniDaInizioAnno1 = data1.giorniDaInizioAnno();
        int giorniDaInizioAnno2 = data2.giorniDaInizioAnno();
        System.out.println("Giorni da inizio anno per Data 1: " + giorniDaInizioAnno1);
        System.out.println("Giorni da inizio anno per Data 2: " + giorniDaInizioAnno2);

        int giorniAFineAnno1 = data1.giorniAFineAnno();
        int giorniAFineAnno2 = data2.giorniAFineAnno();
        System.out.println("Giorni alla fine dell'anno per Data 1: " + giorniAFineAnno1);
        System.out.println("Giorni alla fine dell'anno per Data 2: " + giorniAFineAnno2);
    }
}
