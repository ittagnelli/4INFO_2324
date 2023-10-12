public class Lettera {
    private char lettera;
    private int comparizioni;

    public Lettera(){}

    public Lettera(char letter){
        setlettera(letter);
    }

    public void increase(){
        comparizioni++;
    }

    public char getLettera(){
        return lettera;
    }

    public void setlettera(char letter){
        lettera = letter;
        comparizioni = 1;
    }

    public int getComparizioni(){
        return comparizioni;
    }

    public String toString(){
        return "la lettera '" + lettera + "' compare " + comparizioni + " volte\n";
    }
}
