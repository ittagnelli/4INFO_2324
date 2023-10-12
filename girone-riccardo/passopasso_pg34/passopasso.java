import java.util.Scanner;
public class Minuscolo {
    static final int TANTI = 30;
    public static void main(string[] args) {
        Scanner in = new char[TANTI];
        String parola;
        char[] minuscolo = new char[TANTI];
        System.out.print("\nInserisci una parola");
        parola =in.next();

        for (int x = 0; x < parola.length(); x++)
            minuscolo[x] = parola.charAt(x);

        for (int x = 0; x < parola.length(); x++)  
            minuscolo[x] = Character.toLowerCase(minuscolo[x]);
        
        System.out.print("la parola in minuscolo (array): ");

        for (int x= 0, x < minuscolo.length; x++)
            System.out.print(minuscolo[x]);

        String parolaMinu = new String(minuscolo);
        System.out.print("\nla parola in minuscolo (oggetto):");
        System.out.println(parolaMinu);
    }
}
