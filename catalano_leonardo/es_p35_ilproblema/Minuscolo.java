
import java.util.Scanner;
public class Minuscolo{
static final int TANTI = 30;
public static void main(String[]args){
    Scanner in = new Scanner(System.in);
String parola;
char[]minuscolo = new char [TANTI];
System.out.print("\nInserisci una parola");
parola= in.next();
for (int x=0; x< parola.length();x++)
minuscolo[x] = parola.charAt(x);
for(int x=0; x<parola.length();x++)
minuscolo[x]= Character.toLowerCase(minuscolo[x]);

System.out.print("La parola in minuscolo (array) :");
for (int x=0; x< parola.length();x++)
System.out.print(minuscolo[x]);

String parolaMinu= new String(minuscolo);
System.out.print("\nLa parola in minuscolo (oggetto): ");
System.out.print(parolaMinu);
}



}