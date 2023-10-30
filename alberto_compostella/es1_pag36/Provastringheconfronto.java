import java.util.Scanner;
public class Provastringheconfronto {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("inserisci due parole: ");
        String s1= in.nextLine();
        String s2= in.nextLine();
        System.out.println("se è 0, le parole sono uguali,se è N, alcune lettere sono diverse: "+stringheconfronto.compare(s1,s2));

    }
    
}
