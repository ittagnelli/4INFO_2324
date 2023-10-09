import java.util.Scanner;

public class ProvaMoneta{
    public static void main() throws Exception{
        Scanner in = new Scanner (System.in);
        int sceltaGiocatore;
        int lanciTesta;
        System.out.println("Gioco del testa o croce - 5 lanci");
        System.out.println("Scegli testa (0) oppure croce (1): ");
        sceltaGiocatore = in.nextInt();
        Moneta miaMoneta = new Moneta();
        for (int x = 0; x < 5; x++) {
            miaMoneta.lancia();
            System.out.println(miaMoneta.toString());
        if (miaMoneta.isTesta())
            lanciTesta ++;
        }

        if ((sceltaGiocatore == 0) && (lanciTesta > 2))
            System.out.println("--> hai vinto!");
        else
            System.out.println("--> ha vinto il PC!");
    }
}
