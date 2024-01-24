public class provaAuto {
    public static void main(String[] args) {
        Auto a = new Auto("asdfgh", "ciao", "ferrari", 2000);
        a.stampa();
        Automezzo am = new Automezzo("qwerty", "salve", "fiat", 2010, 5);
        am.stampa();
        Camion c = new Camion("zxcvbn", "giorno", "lamborghini", 1980, 3, "oggetti");
        c.stampa();
    }
}
