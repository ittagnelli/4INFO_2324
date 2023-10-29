import java.util.Scanner;

public class Telefono extends Elettrodomestici{
    private Scanner in = new Scanner(System.in);

    public void ricercaSuInternet(){
        if(acceso){
            System.out.println("inserisci la tua ricerca:");
            in.nextLine();
            System.out.println("nessuna connessione a internet");     
        } else{
            System.out.println("telefono spento");
        }
    }
}
