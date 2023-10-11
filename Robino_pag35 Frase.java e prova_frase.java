Frase.java

public class Frase {
    private int num_vocali;
    private int num_consonanti;
    private String frase;

    public Frase(String inserisco_frase) {
        frase = inserisco_frase;
        num_vocali = 0;
        num_consonanti = 0;
    } 

    public void numero_vocali() {
        for(int i = 0; i < frase.length(); i ++) {
            if((Character.toLowerCase(frase.charAt(i)) == 'a') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'e') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'i') ||
                    (Character.toLowerCase(frase.charAt(i)) == 'u') || 
                    (Character.toLowerCase(frase.charAt(i)) == 'o')) num_vocali ++;
        }
    }

    public void numero_consonanti() {
        for(int i = 0; i < frase.length(); i ++) {
            if((Character.toLowerCase(frase.charAt(i)) != 'a') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'e') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'i') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'u') &&
                    (Character.toLowerCase(frase.charAt(i)) != 'o')) num_consonanti ++;
        }
    }


  prova_frase.java

  import java.util.Scanner;
public class prova_frase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;

        System.out.print("scrivi parola: ");
        parola = in.next();

        Frase frase = new Frase(parola);
        frase.numero_consonanti();
        frase.numero_vocali();
        System.out.println(frase);

        in.close();
    }
}

    public String toString() {
        return "numero vocali : " + num_vocali + "\nnumero consonanti : " + num_consonanti;
    }
}
