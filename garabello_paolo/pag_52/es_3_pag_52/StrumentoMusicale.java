public class StrumentoMusicale {
    protected String suono;

    public StrumentoMusicale(){
        suono = "doremi";
    }

    public StrumentoMusicale(String sound){
        suono = sound;
    }

    public void setSuono(String sound){
        suono = sound;
    }

    public void suona(){
        System.out.println(suono);
    }
}
