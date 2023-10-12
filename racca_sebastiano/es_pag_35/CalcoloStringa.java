public class CalcoloStringa {
    private String str;
    private int[] charCounter;
    private int vocali;
    private int consonanti;

    public CalcoloStringa(String string) {
        str = string;
    
        charCounter = new int[256];
        vocali = 0;
        consonanti = 0;
    
        for (int i = 0; i < str.length(); i++) {
            charCounter[(int) str.charAt(i)]++;

            if(isVocale(str.charAt(i))) {
                vocali++;
            } else {
                consonanti++;
            }
        }

    }


    private boolean isVocale(char c) {
        char lowercaseChar = Character.toLowerCase(c);
        return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u';
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
                ret = ret.concat("\n" + (char)i + ": " + charCounter[i]);
            }
        }

        return ret;
    }

}
