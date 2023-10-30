public class CityCar extends MezzoDiTrasporto{
    private Boolean modalitàRisparmio;

    public CityCar(int horsePower, int maxSpeed){
        modalitàRisparmio = false;
        setVelocitàMax(maxSpeed);
        setCavalli(horsePower);
    }

    public void cambiaModalità(){
        if(modalitàRisparmio){
            setVelocitàMax(velocitàMax/2);
            setCavalli(cavalli/2); 
        }else{
            setVelocitàMax(velocitàMax*2);
            setCavalli(cavalli*2);   
        }
        modalitàRisparmio = !modalitàRisparmio;

    }
}
