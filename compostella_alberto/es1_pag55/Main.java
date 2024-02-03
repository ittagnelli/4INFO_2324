public class Main {
    public static void main(String[] args) {
        auto auto1 = new auto("fiat","panda","ev847",2000,1000,1002);
        automezzo automezzo1 = new automezzo(10000, 2000);
        camion camion1 = new camion("alimentari", 100, 4000, 2000);
        System.out.println(auto1.toString());
        System.out.println(automezzo1.toString());
        System.out.println(camion1.toString());

    }
    
}
