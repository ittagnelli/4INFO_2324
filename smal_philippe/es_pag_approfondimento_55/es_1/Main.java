public class Main {
   public static void main(String[] args) {
        Data date_1 = new Data(18, 12);
        Data date_2 = new Data(27, 2);

        System.out.println(date_1);
        date_1.nextDay();
        System.out.println(date_1);

        System.out.println(date_2);
        date_2.nextMonth();
        System.out.println(date_2);

        System.out.println("\ndata_1 e data_2 e sono uguali? >>> " + date_1.isEqual(date_2));
        System.out.println("\nGiorni rimanenti dell' anno di data_1 >>> " + date_1.giorniAfineAnno());
        System.out.println("\nGiorni dall'inizio dell' anno di data_2 >>> " + date_2.giorniDalinizioAnno());
   } 
}
