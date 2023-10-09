import java.util.Scanner;
public class ProvaMoneta {
    public static void main(String[] args){
        Scanner inputUtente =  new Scanner(System.in);
        int sceltaGiocatore;
        int lanciTesta = 0;
        System.out.println("Testa o Croce?");
        System.out.println("Scegli la faccia:");
        sceltaGiocatore = inputUtente.nextInt();
        Moneta moneta = new Moneta();
        for (int x = 0; x < 5; x++){
            moneta.lancia();
            System.out.println(moneta.toString());
            if (moneta.isTesta())
                lanciTesta++;
        }

        if ((sceltaGiocatore == 0 ) && (lanciTesta >))
            System.out.println(" ---> hai vinto");
        else
            System.out.println(" ---> hai perso");
    }
}
