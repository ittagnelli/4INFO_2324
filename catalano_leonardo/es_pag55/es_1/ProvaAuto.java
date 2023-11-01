public class ProvaAuto {
    public static void main(String[] args) {
        Auto a = new Auto("tjfhdh", "kia", "mclaren", 2004);
        a.stampa();
        AutoMezzo am = new AutoMezzo("rfhddkj", "porsche", "panda", 2018, 5);
        am.stampa();
        Camion c = new Camion("dfhdggd", "skoda", 2020, 3, "alfaromeo", "cambio");
        c.stampa();
    }
}