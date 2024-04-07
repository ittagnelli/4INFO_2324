public class Automobile extends MezzoDiTrasporto {
    private boolean modalitàSport;

    public Automobile(int horsePower, int maxSpeed){
        setCavalli(horsePower);
        setVelocitàMax(maxSpeed);
        modalitàSport = false;
    }

    public void guidaAutomatica(String destination){
        System.out.println("destinazione impostata:" + destination);
    }

    public void cambiaModalità(){
        if(!modalitàSport){
            setVelocitàMax(velocitàMax/2);
            setCavalli(cavalli/2); 
        }else{
            setVelocitàMax(velocitàMax*2);
            setCavalli(cavalli*2);   
        }
        modalitàSport = !modalitàSport;
    }
}
