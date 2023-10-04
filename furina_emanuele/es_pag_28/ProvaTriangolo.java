import java.util.Scanner;

public class ProvaTriangolo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci il lato 1: ");
        double lato1 = input.nextDouble();
        System.out.print("Inserisci il lato 2: ");
        double lato2 = input.nextDouble();
        System.out.print("Inserisci il lato 3: ");
        double lato3 = input.nextDouble();
        
        Triangolo triangolo = new Triangolo(lato1, lato2, lato3);
        
        triangolo.visualizzaRisultati();
        
        input.close();
    }
}