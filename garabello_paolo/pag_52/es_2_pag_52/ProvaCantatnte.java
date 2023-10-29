public class ProvaCantatnte {
    public static void main(String[] args){
        Compositori compositori = new Compositori();
        Musicisti musicisti = new Musicisti(compositori.creaTraccia());
        Cantanti cantanti = new Cantanti(compositori.creaTesto());

        musicisti.eseguiTraccia();
        cantanti.eseguiTesto();
    }
}
