
import java.util.Scanner;

public class alfabeto {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        String frase;
        System.out.println("inserisci una frase da massimo 100 caratteri");
        frase = in.nextLine();
        frase = frase.replace(" ","");
        frase = frase.toLowerCase();
        int conta_vocali = 0;
        int conta_consonanti = 0;
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'|| frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                conta_vocali++;
            } else{
                conta_consonanti++;
            }
        }
        
                System.out.println("il numero di consonanti e' "+conta_consonanti+" il numero delle vocali e' "+ conta_vocali);




    }
    
}
