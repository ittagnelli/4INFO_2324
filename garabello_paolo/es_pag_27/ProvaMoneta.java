import java.util.Scanner;

public class ProvaMoneta {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int choice;
        do{
            System.out.println("inserire testa (0) o croce (1)");
            choice = in.nextInt();
            if(choice != 0 && choice != 1)
                System.out.println("scelta non valida\n");
        }while(choice != 0 && choice != 1);

        in.close();

        boolean finish = false;
        int PlayerCount = 0, ComputerCount = 0;
        Moneta coin = new Moneta();

        while(!finish){
            coin.lancia();
            int lancia = coin.GiveResult();
            System.out.println("è uscito "+ lancia);
            if(lancia == choice){
                PlayerCount++;
            }else{
                ComputerCount++;
            }
            if(PlayerCount == 3){
                finish = true;
                System.out.println("ha vinto il giocatore"); 
            }
            if(ComputerCount == 3){
                finish = true;
                System.out.println("ha vinto il computer");
            }
        }
    }    
}
