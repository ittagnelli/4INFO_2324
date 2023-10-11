import java.util.Scanner;

public class ProvaMoneta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sceltaGiocatore;
        int lanciTesta = 0;
        System.out.println("Scegli testa (0) o croce (1)");
        sceltaGiocatore = in.nextInt();
        Moneta miaMoneta = new Moneta();

        for (int i = 0; i < 5; i++) {
            miaMoneta.lancia();
            System.out.println(miaMoneta.toString());
            if (miaMoneta.isTesta()) lanciTesta++;
        }

        if ((sceltaGiocatore == 0) && (lanciTesta >= 3)) System.out.println("hai vinto");
        else if ((sceltaGiocatore == 1) && (lanciTesta <= 2)) System.out.println("hai vinto");
        else System.out.println("hai perso");

        in.close();
    }
}
