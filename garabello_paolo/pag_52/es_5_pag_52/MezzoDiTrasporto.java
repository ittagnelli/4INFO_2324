class MezzoDiTrasporto {
    protected int cavalli;
    protected int velocitàMax;
    protected boolean acceso = false;

    public void accendiSpegni(){
        acceso = !acceso;
    }

    public void setVelocitàMax(int velocità){
        velocitàMax = velocità;
    }

    public int getVelocitàMax(){
        return velocitàMax;
    }

    public void setCavalli(int horsePower){
        cavalli = horsePower;
    }

    public int getCavalli(){
        return cavalli;
    }
}
