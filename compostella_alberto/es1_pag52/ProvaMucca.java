import java.util.Scanner;

public class ProvaMucca {
    public static void main(String args[]){
        mucca Mucca = new mucca();
        Scanner in= new Scanner(System.in);
        System.out.println("inserisci true se ha le zampe sennò false");
        Mucca.Setzampe(in.nextBoolean());
        if(Mucca.getNzampe() == 4){
            System.out.println("può essere una mucca");
            }else{
                System.out.println("non può essere una mucca");
             }
    }
}
