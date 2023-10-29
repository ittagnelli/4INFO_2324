public class ProvaAutomobile {
    public static void main(String[] args){

        CityCar macchina = new CityCar(100, 200);
        System.out.println("cavalli = " + macchina.getCavalli() + " velocitàmax = " + macchina.getVelocitàMax());
        macchina.cambiaModalità();
        System.out.println("cavalli = " + macchina.getCavalli() + " velocitàmax = " + macchina.getVelocitàMax());

        Automobile car = new Automobile(300, 400);
        System.out.println("cavalli = " + car.getCavalli() + " velocitàmax = " + car.getVelocitàMax());
        car.cambiaModalità();
        System.out.println("cavalli = " + car.getCavalli() + " velocitàmax = " + car.getVelocitàMax());
        car.guidaAutomatica("Roma");
    }
}
