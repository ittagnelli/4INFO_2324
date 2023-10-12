import java.util.Scanner;

public class Minuscolo{

    static final int TANTI = 30;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("inserire una stringa");
        String str = in.nextLine();

        char[] arrayStr = new char[TANTI];

        System.out.println("\nla stringa in minuscolo(oggetto): ");

        for(int i = 0; i < str.length(); i++){
            arrayStr[i]= Character.toLowerCase(str.charAt(i));
            System.out.print(arrayStr[i]);
        }

        String parolaMinu = new String(arrayStr);
        System.out.println("\n\nla stringa in minuscolo(oggetto): " + parolaMinu + "\n");

        in.close();
    }
}