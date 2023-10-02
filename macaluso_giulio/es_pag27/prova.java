import java.util.Scanner;

public class prova {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sceltaGiocatore;
        int lanciTesta = 0;
        int lanciCroce = 0;

        System.out.println("testa o croce 5 lanci\n");
        System.out.print("Scegli testa(0) o croce(1): ");
        sceltaGiocatore = in.nextInt();
        Moneta miaMoneta = new Moneta();

        for(int i = 0; i < 5; i++) {
            miaMoneta.lancia();
            System.out.println(miaMoneta.toString());
            if(miaMoneta.isTesta()){
                lanciTesta++;
            } else {
                lanciCroce++;
            }
        }
        if(((sceltaGiocatore == 0) && (lanciTesta > 2)) || ((sceltaGiocatore == 1) && (lanciCroce > 2))){
            System.out.println("hai vinto\n");
        } else {
            System.out.println("ha vinto il pc\n");
        }
    }
}
