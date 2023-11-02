import java.util.Scanner;

public class provaLampadina {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("inserire il numero massimo di click:");
        Lampadina lampadina = new Lampadina(in.nextInt());

        int choice;
        do{
            do{
                System.out.println("inserire 0 per clicckare, 1 per vedere lo stato oppure 2 per uscire");
                choice = in.nextInt();
                if(choice < 0 || choice > 2)
                    System.out.println("numero non valido");
            }while(choice < 0 || choice > 2);
            switch (choice) {
                case 0:
                    lampadina.click();
                    break;
                case 1:
                System.out.println("status = " + lampadina);
                default:
                    break;
            }
        }while(choice != 2);
        in.close();
        System.out.println("spegnimeto");
    }
}
