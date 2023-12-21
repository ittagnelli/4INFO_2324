public class CalcoloStringa {
    private String str;
    private int[] charCounter;
    private int vocali;
    private int consonanti;

    public CalcoloStringa(String string) {
        str = string;
    
        charCounter = new int[53];
        vocali = 0;
        consonanti = 0;
    
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            if(isVocale(current)) {
                vocali++;
            } else if(isConsonante(current)){
                consonanti++;
            } else {
                continue;
            }

            charCounter[((int) current) - ((int) 'A')]++;
        }

    }


    private boolean isVocale(char c) {
        return "aeiou".indexOf(Character.toLowerCase(c)) >= 0;
    }

    private boolean isConsonante(char c) {
        return "bcdfghjklmnpqrstvwxyz".indexOf(Character.toLowerCase(c)) >= 0;
    }

    public int getVocali() {
        return vocali;
    }

    public int getConsonanti() {
        return consonanti;
    }

    public int[] getOccorrenze() {
        return charCounter;
    }


    public String toString() {
        String ret = "Stringa: " + str + "\nVocali: " + vocali + "\nConsonanti: " + consonanti + "\nOccorrenze:";

        for (int i = 0; i < charCounter.length; i++) {
            if(charCounter[i] != 0) {
                ret = ret.concat("\n" + (char)(i + ((int) 'A')) + ": " + charCounter[i]);
            }
        }

        return ret;
    }

}
