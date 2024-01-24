public class auto extends automezzo {
    private String marca;
    private String modello;
    private String targa;
    private int anno;
    public auto(String marca, String modello, String targa,int anno, double peso, int cilindrata){
        super(peso, cilindrata);
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.anno = anno;
    }

    public String getMarca(){
        return marca;
    }
    public String getModello(){
        return modello;
    }
 public String getTarga(){
        return targa;
    }
 public int getanno(){
        return anno;
    }
    @Override
    public String toString(){
        return "auto{marca: "+marca+", modello: "+modello+", targa: "+targa+", anno: "+anno+"}";    
    }


    
}
