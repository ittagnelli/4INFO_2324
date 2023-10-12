import java.util.Scanner;

public class CalcoloStringa {
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        System.out.println("inserire una stringa max 100 caratteri");
        String str = in.nextLine();
        int vowels = 0, consonants = 0;
        Lettera[] lettere = new Lettera[str.length()];

        for(int i = 0; i < str.length(); i++){
            char character = str.toLowerCase().charAt(i);
            if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                vowels++;
            }else {
                consonants++;
            };
            for(int j = 0; j < lettere.length; j++){
                if(lettere[j] == null){
                    lettere[j] = new Lettera(character);
                    break;
                } else {
                    if(lettere[j].getLettera() == character){
                        lettere[j].increase();
                        break;
                    }
                }

            }
        }
        for(int i = 0; i < str.length(); i++){
            if(lettere[i] != null){
                System.out.println(lettere[i]);
            }
        }
        System.out.println("Ci sono " + vowels + " vocali e " + consonants + " consonanti");
        in.close();
    }

}
